package com.example.exp2.Controller;

import com.example.exp2.Common.CommonResponse;
import com.example.exp2.Service.ApiInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ApiController {
    private ApiInfoService apiInfoService;

    public ApiController(ApiInfoService apiInfoService){
        this.apiInfoService = apiInfoService;
    }

    @GetMapping("")
    public CommonResponse<Object> getApiLinkList(){
        return CommonResponse.forSuccess("成功获取API列表", apiInfoService.getApiLinks());
    }
}
