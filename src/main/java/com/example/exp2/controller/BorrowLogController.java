package com.example.exp2.controller;

import com.example.exp2.service.BorrowLogService;
import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.borrowLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/borrow")
@CrossOrigin
public class BorrowLogController {
    private BorrowLogService borrowLogService;

    @Autowired
    public BorrowLogController(BorrowLogService borrowLogService) {
        this.borrowLogService = borrowLogService;
    }

    @GetMapping(value = "", name = "getborrowLogList")
    public CommonResponse<Object> getborrowList() {
        return CommonResponse.forSuccess("成功获取出借物资列表", borrowLogService.getAllBorrowLog());
    }

    @GetMapping(value = "/{id}", name = "getborrowLogById")
    public CommonResponse<Object> getborrowById(@PathVariable("id") String borrowId){
        return CommonResponse.forSuccess("成功获取指定出借物资", borrowLogService.getBorrowLogById(borrowId));
    }
    @PatchMapping(value = "/{id}", name = "updateborrowLogById")
    public CommonResponse<Object> updateborrowLogById(@RequestBody borrowLog borrowLog, @PathVariable("id") String borrowId) {
        return CommonResponse.forSuccess("成功更新指定出借物资", borrowLogService.updateBorrowLogById(borrowId,borrowLog));
    }

    @PostMapping(value = "", name = "addborrowLog")
    public CommonResponse<Object> addborrow(@RequestBody borrowLog borrowLog){
        return CommonResponse.forSuccess("成功添加出借物资", borrowLogService.addBorrowLog(borrowLog));
    }

    @DeleteMapping(value = "/{id}", name = "deleteborrow")
    public CommonResponse<Object> deleteborrow(@PathVariable("id") String borrowId){
        return CommonResponse.forSuccess("成功删除指定出借物资", borrowLogService.deleteBorrowLogById(borrowId));
    }


}

