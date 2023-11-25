package com.example.exp2.controller;

import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.Staff;
import com.example.exp2.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public CommonResponse getStaffById(@PathVariable("id") String id)
    {
        return CommonResponse.forSuccess("成功获取员工信息",staffService.getStaffById(id));
    }

    @PostMapping
    public CommonResponse addStaff(@RequestBody Staff staff)
    {
        return CommonResponse.forSuccess("成功添加员工信息",staffService.addStaff(staff));
    }

    @PatchMapping("{id}")
    public CommonResponse updateStaffById(@PathVariable("id") String id, @RequestBody Staff staff)
    {
        return CommonResponse.forSuccess("成功更新员工信息",staffService.updateStaffById(id,staff));
    }

    @DeleteMapping("{id}")
    public CommonResponse deleteStaffById(@PathVariable("id") String id)
    {
        return CommonResponse.forSuccess("成功删除员工信息",staffService.deleteStaffById(id));
    }
}
