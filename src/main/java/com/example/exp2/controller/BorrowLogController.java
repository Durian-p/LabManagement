package com.example.exp2.controller;

import com.example.exp2.service.BorrowLogService;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.BorrowLog;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/borrowlog")
@CrossOrigin
@Api(tags = "出借物资接口")
public class BorrowLogController {
    private BorrowLogService borrowLogService;

    @Autowired
    public BorrowLogController(BorrowLogService borrowLogService) {
        this.borrowLogService = borrowLogService;
    }

    @GetMapping(value = "", name = "getborrowLogList")
    @Operation(summary = "获取出借记录列表")
    public CommonResponse<Object> getborrowList() {
        return CommonResponse.forSuccess("成功获取出借物资记录列表", borrowLogService.getAllBorrowLog());
    }

    @GetMapping(value = "/{id}", name = "getborrowLogById")
    @Operation(summary = "根据id获取出借记录")
    public CommonResponse<Object> getborrowById(@PathVariable("id") String borrowId){
        return CommonResponse.forSuccess("成功获取指定出借物资记录", borrowLogService.getBorrowLogById(borrowId));
    }
    @PatchMapping(value = "/{id}", name = "updateborrowLogById")
    @Operation(summary = "根据id更新出借记录")
    public CommonResponse<Object> updateborrowLogById(@RequestBody BorrowLog borrowLog, @PathVariable("id") String borrowId) {
        return CommonResponse.forSuccess("成功更新指定出借物资记录", borrowLogService.updateBorrowLogById(borrowId,borrowLog));
    }

    @PostMapping(value = "", name = "addborrowLog")
    @Operation(summary = "添加出借记录")
    public CommonResponse<Object> addborrow(@RequestBody BorrowLog borrowLog){
        return CommonResponse.forSuccess("成功添加出借物资记录", borrowLogService.addBorrowLog(borrowLog));
    }

    @DeleteMapping(value = "/{id}", name = "deleteborrow")
    public CommonResponse<Object> deleteborrow(@PathVariable("id") String borrowId){
        return CommonResponse.forSuccess("成功删除指定出借物资记录", borrowLogService.deleteBorrowLogById(borrowId));
    }


}

