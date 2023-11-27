package com.example.exp2.controller;

import com.example.exp2.pojo.ReturnLog;
import com.example.exp2.service.ReturnLogService;
import com.example.exp2.common.CommonResponse;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/returnlog")
@CrossOrigin
@Api(tags = "归还物资接口")
public class ReturnLogController {
    private ReturnLogService returnLogService;

    @Autowired
    public ReturnLogController(ReturnLogService returnLogService) {
        this.returnLogService = returnLogService;
    }

    @GetMapping(value = "", name = "getReturnLogList")
    @Operation(summary = "获取归还物资记录列表")
    public CommonResponse<Object> getReturnList() {
        return CommonResponse.forSuccess("成功获取归还物资记录列表", returnLogService.getAllReturnLog());
    }

    @GetMapping(value = "/{id}", name = "getReturnLogById")
    @Operation(summary = "根据id获取归还物资")
    public CommonResponse<Object> getReturnById(@PathVariable("id") String returnId){
        return CommonResponse.forSuccess("成功获取指定归还物资记录", returnLogService.getReturnLogById(returnId));
    }
    @PatchMapping(value = "/{id}", name = "updateReturnLogById")
    @Operation(summary = "根据id更新归还物资")
    public CommonResponse<Object> updateReturnLogById(@RequestBody ReturnLog returnLog, @PathVariable("id") String returnId) {
        return CommonResponse.forSuccess("成功更新指定归还物资", returnLogService.updateReturnLogById(returnId,returnLog));
    }

    @PostMapping(value = "", name = "addReturnLog")
    @Operation(summary = "添加归还物资")
    public CommonResponse<Object> addReturn(@RequestBody ReturnLog returnLog){
        return CommonResponse.forSuccess("成功添加归还物资", returnLogService.addReturnLog(returnLog));
    }

    @DeleteMapping(value = "/{id}", name = "deleteReturn")
    @Operation(summary = "根据id删除归还物资")
    public CommonResponse<Object> deleteReturn(@PathVariable("id") String returnId){
        return CommonResponse.forSuccess("成功删除指定归还物资", returnLogService.deleteReturnLogById(returnId));
    }


}

