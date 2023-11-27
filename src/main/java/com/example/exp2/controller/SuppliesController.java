package com.example.exp2.controller;

import com.example.exp2.service.SuppliesService;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.Supplies;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/supplies")
@CrossOrigin
@Api(tags = "物资管理接口")
public class SuppliesController {
    private SuppliesService suppliesService;

    @Autowired
    public SuppliesController(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @GetMapping(value = "", name = "getSuppliesList")
    @Operation(summary = "获取物资列表")
    public CommonResponse<Object> getSuppliesList() {
        return CommonResponse.forSuccess("成功获取物资列表", suppliesService.getSuppliesList());
    }

    @GetMapping(value = "/{id}", name = "getSuppliesById")
    @Operation(summary = "根据id获取物资")
    public CommonResponse<Object> getSuppliesById(@PathVariable("id") Integer suppliesId){
        return CommonResponse.forSuccess("成功获取指定物资", suppliesService.getSuppliesById(suppliesId));
    }
    @PatchMapping(value = "/{id}", name = "updateSuppliesById")
    @Operation(summary = "根据id更新物资")
    public CommonResponse<Object> updateSuppliesById(@RequestBody Supplies supplies, @PathVariable("id") Integer suppliesId) {
        return CommonResponse.forSuccess("成功更新制定物资", suppliesService.updateSuppliesById(supplies.getSuppliesName(), supplies.getQuantity(), suppliesId));
    }

    @PostMapping(value = "", name = "addSupplies")
    @Operation(summary = "添加物资")
    public CommonResponse<Object> addSupplies(@RequestBody Supplies supplies){
        return CommonResponse.forSuccess("成功添加物资", suppliesService.addSupplies(supplies));
    }

    @DeleteMapping(value = "/{id}", name = "deleteSupplies")
    @Operation(summary = "根据id删除物资")
    public CommonResponse<Object> deleteSupplies(@PathVariable("id") Integer suppliesId){
        return CommonResponse.forSuccess("成功删除指定物资", suppliesService.deleteSuppliesById(suppliesId));
    }


}

