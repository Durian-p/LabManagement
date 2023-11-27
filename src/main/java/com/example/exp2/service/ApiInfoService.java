package com.example.exp2.service;

import com.example.exp2.pojo.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ApiInfoService {


    private final RequestMappingHandlerMapping handlerMapping;
    private static final String URL_PREFIX = "http://localhost:8080";

    @Autowired
    public ApiInfoService(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

    public List<Link> getApiLinks() {
        List<Link> links = new ArrayList<>();

        Map<RequestMappingInfo, HandlerMethod> handlerMethods = handlerMapping.getHandlerMethods();
        for (RequestMappingInfo info : handlerMethods.keySet()) {
            if (info.getMethodsCondition().isEmpty()) continue;

            // 在Spring Boot 2.x中使用getPatternsCondition()
            Set<String> patterns = info.getPatternsCondition().getPatterns();
            for (String pattern : patterns) {
                links.add(new Link(info.getName(), URL_PREFIX + pattern));
            }
        }

        return links;
    }

}
