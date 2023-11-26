package com.example.exp2.Controller;

import com.example.exp2.Service.SuppliesService;
import com.example.exp2.Common.CommonResponse;
import com.example.exp2.pojo.Supplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/supplies")
@CrossOrigin
public class SuppliesController {
    private SuppliesService suppliesService;

    @Autowired
    public SuppliesController(SuppliesService suppliesService) {
        this.suppliesService = suppliesService;
    }

    @GetMapping(value = "/all", name = "getSuppliesList")
    public CommonResponse<Object> getSuppliesList() {
        return CommonResponse.forSuccess("成功获取物资列表", suppliesService.getSuppliesList());
    }

    @GetMapping(value = "/get/{id}", name = "getSuppliesById")
    public CommonResponse<Object> getSuppliesById(@PathVariable("id") Integer suppliesId){
        return CommonResponse.forSuccess("成功获取指定物资", suppliesService.getSuppliesById(suppliesId));
    }
    @PatchMapping(value = "/update/{id}", name = "updateSuppliesById")
    public CommonResponse<Object> updateSuppliesById(@RequestBody Supplies supplies, @PathVariable("id") Integer suppliesId) {
        return CommonResponse.forSuccess("成功更新制定物资", suppliesService.updateSuppliesById(supplies.getSuppliesName(), supplies.getQuantity(), suppliesId));
    }

    @PostMapping(value = "/add", name = "addSupplies")
    public CommonResponse<Object> addSupplies(@RequestBody Supplies supplies){
        return CommonResponse.forSuccess("成功添加物资", suppliesService.addSupplies(supplies));
    }

    @DeleteMapping(value = "/delete/{id}", name = "deleteSupplies")
    public CommonResponse<Object> deleteSupplies(@PathVariable("id") Integer suppliesId){
        return CommonResponse.forSuccess("成功删除指定物资", suppliesService.deleteSuppliesById(suppliesId));
    }


}

