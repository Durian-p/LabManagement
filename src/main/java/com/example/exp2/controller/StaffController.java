package com.example.exp2.controller;

import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.Staff;
import com.example.exp2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController
{
    StaffService staffService;

    @Autowired
    StaffController(StaffService staffService)
    {
        this.staffService = staffService;
    }

    @GetMapping("")
    //@ApiOperation("获取所有员工列表")
    public CommonResponse getAllStaffs()
    {
        return CommonResponse.forSuccess("成功获取员工列表",staffService.getAllStaffs());
    }
}
