package com.example.exp2.service;

import com.alibaba.fastjson.JSONObject;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.parser.OpenAPIV3Parser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OpenAPIService {

    @Value("${openapi.document.path}")
    String openApiDocumentPath;

    public List<JSONObject> extractAPIInfo() {
        // 解析OpenAPI文档
        OpenAPI openAPI = new OpenAPIV3Parser().read(openApiDocumentPath);

        // 提取API信息
        List<JSONObject> apiInfos = new ArrayList<>();
        Paths paths = openAPI.getPaths();
        for (Map.Entry<String, PathItem> entry : paths.entrySet()) {
            String path = entry.getKey();
            PathItem pathItem = entry.getValue();

            pathItem.readOperationsMap().forEach((httpMethod, operation) -> {
                JSONObject apiInfo = new JSONObject();
                apiInfo.put("path", path);
                apiInfo.put("description", operation.getSummary());
                apiInfo.put("method", httpMethod.toString());

                apiInfos.add(apiInfo);
            });
        }

        // 将API信息转换为JSON字符串
        return apiInfos;
    }
}

