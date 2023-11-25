package com.example.exp2.Controller;

import com.example.exp2.Service.SuppliesService;
import com.example.exp2.Common.CommonResponse;
import com.example.exp2.pojo.Supplies;
import org.apache.ibatis.annotations.Param;
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

    @PatchMapping(value = "{id}", name = "updateSuppliesById")
    @ResponseBody
    public CommonResponse<Object> updateSuppliesById(@RequestParam("suppliesName") String suppliesName, @RequestParam("quantity") int quantity, @PathVariable("id") int suppliesId) {
        boolean result = suppliesService.updateSuppliesById(suppliesName, quantity, suppliesId);
        return CommonResponse.forSuccess("成功更新制定物资", result);
    }
}

