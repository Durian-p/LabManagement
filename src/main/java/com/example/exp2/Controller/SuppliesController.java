package com.example.exp2.controller;

import com.example.exp2.Service.SuppliesService;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.Supplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/supplies", name = "Supplies")
@CrossOrigin
public class SuppliesController {
    private SuppliesService suppliesService;

    @Autowired
    public SuppliesController(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @GetMapping(value = "", name = "getSuppliesList")
    @ResponseBody
    public CommonResponse<Object> getSuppliesList() {
        List<Supplies> suppliesList = suppliesService.getSuppliesList();
        return CommonResponse.forSuccess("成功获取物资列表", suppliesList);
    }

    @PutMapping(value = "", name = "updateSuppliesById")
    @ResponseBody
    public CommonResponse<Object> updateSuppliesById(@RequestBody Supplies supplies) {
        boolean result = suppliesService.updateSuppliesById(supplies);
        return CommonResponse.forSuccess("成功获取制定物资", result);
    }
}

