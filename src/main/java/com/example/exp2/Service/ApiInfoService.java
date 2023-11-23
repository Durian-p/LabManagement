package com.example.exp2.Service;

import com.example.exp2.pojo.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
            for (PathPattern pattern : info.getPathPatternsCondition().getPatterns()) {
                links.add(new Link(info.getName(), URL_PREFIX + pattern.toString()));
            }
        }

        return links;
    }
}
