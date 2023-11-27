package com.example.exp2.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.service.OpenAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HyperController
{
    OpenAPIService openAPIService;

    @Autowired
    HyperController(OpenAPIService openAPIService)
    {
        this.openAPIService = openAPIService;
    }

    @GetMapping(value = "/", name = "getHypermedia")
    public CommonResponse getHypermedia()
    {
        List<JSONObject> res = openAPIService.extractAPIInfo();
        return CommonResponse.forSuccess("成功获取超媒体信息", res);
    }

}