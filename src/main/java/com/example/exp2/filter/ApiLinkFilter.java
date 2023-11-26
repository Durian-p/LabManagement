package com.example.exp2.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.exp2.service.ApiInfoService;
import com.example.exp2.pojo.Link;
import com.example.exp2.wrapper.ResponseWrapper;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Component
@WebFilter
public class ApiLinkFilter implements Filter {
    @Autowired
    private ApiInfoService service;

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        ResponseWrapper wrapper = new ResponseWrapper(response);
        filterChain.doFilter(servletRequest, wrapper);

        String content = new String(wrapper.getContent(), StandardCharsets.UTF_8),  //返回数据
                url = getMappingPath(request.getRequestURL().toString());   //当前请求url

        if (content.isEmpty() || content.isBlank()) return;
        JSONObject data = JSON.parseObject(content);

        //获取所有API链接
        if (service != null) {
            List<Link> links = service.getApiLinks();
            Map<String, String> apis = new HashMap<>();
            for (Link link : links) {
                if (url.contains(link.getUrl()) || link.getName() == null) continue;
                apis.put(link.getName(), link.getUrl());
            }
            data.put("apis", apis);
            content = data.toJSONString();
        }

        //这里要注意：setContentLength(字符串的字节长度，不是字符串的长度)
        response.setContentLength(content.getBytes(StandardCharsets.UTF_8).length);
        //修改完写入输出流，返回给前端
        //JDK8写法
        try (ServletOutputStream out = response.getOutputStream()) {
            out.write(content.getBytes(StandardCharsets.UTF_8));//写入返回内容
            out.flush();//刷新
        }
    }

    private static String getMappingPath(String url) {
        int index = url.indexOf('?');
        if (index == -1) return url;
        return url.substring(0, index);
    }
}
