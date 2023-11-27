package com.example.exp2.controller;

import com.example.exp2.service.ReturnLogService;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.returnLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/returnlog")
@CrossOrigin
public class ReturnLogController {
    private ReturnLogService returnLogService;

    @Autowired
    public ReturnLogController(ReturnLogService returnLogService) {
        this.returnLogService = returnLogService;
    }

    @GetMapping(value = "", name = "getReturnLogList")
    public CommonResponse<Object> getReturnList() {
        return CommonResponse.forSuccess("成功获取出借物资列表", returnLogService.getAllReturnLog());
    }

    @GetMapping(value = "/{id}", name = "getReturnLogById")
    public CommonResponse<Object> getReturnById(@PathVariable("id") String returnId){
        return CommonResponse.forSuccess("成功获取指定出借物资", returnLogService.getReturnLogById(returnId));
    }
    @PatchMapping(value = "/{id}", name = "updateReturnLogById")
    public CommonResponse<Object> updateReturnLogById(@RequestBody returnLog returnLog, @PathVariable("id") String returnId) {
        return CommonResponse.forSuccess("成功更新指定出借物资", returnLogService.updateReturnLogById(returnId,returnLog));
    }

    @PostMapping(value = "", name = "addReturnLog")
    public CommonResponse<Object> addReturn(@RequestBody returnLog returnLog){
        return CommonResponse.forSuccess("成功添加出借物资", returnLogService.addReturnLog(returnLog));
    }

    @DeleteMapping(value = "/{id}", name = "deleteReturn")
    public CommonResponse<Object> deleteReturn(@PathVariable("id") String returnId){
        return CommonResponse.forSuccess("成功删除指定出借物资", returnLogService.deleteReturnLogById(returnId));
    }


}

