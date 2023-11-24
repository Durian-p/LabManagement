package com.example.exp2.Controller;

import com.example.exp2.Common.CommonResponse;
import com.example.exp2.Service.SuppliesService;
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

    @GetMapping(value = "/get", name = "getSuppliesList")
    @ResponseBody
    public CommonResponse<Object> getSuppliesList() {
        List<Supplies> suppliesList = suppliesService.getSuppliesList();
        return CommonResponse.forSuccess(suppliesList);
    }

    @PutMapping(value = "/put", name = "updateSuppliesById")
    @ResponseBody
    public CommonResponse<Object> updateSuppliesById(@RequestBody Supplies supplies) {
        boolean result = suppliesService.updateSuppliesById(supplies);
        return CommonResponse.forSuccess(result);
    }
}

