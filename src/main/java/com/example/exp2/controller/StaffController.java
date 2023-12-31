package com.example.exp2.controller;

import com.example.exp2.common.CommonResponse;
import com.example.exp2.pojo.Staff;
import com.example.exp2.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
@Api(tags="人员管理接口")
public class StaffController
{
    StaffService staffService;

    @Autowired
    StaffController(StaffService staffService)
    {
        this.staffService = staffService;
    }

    /**
     * Mapping注解里面的name是返回结果里的api链接的key值
     * 所以需要填一下，直接用函数名就行
     */

    @GetMapping(value = "", name = "getAllStaffs")
    @Operation(summary = "获取所有员工列表")
    public CommonResponse getAllStaffs()
    {
        return CommonResponse.forSuccess("成功获取员工信息", staffService.getAllStaffs());
    }

    @GetMapping(value = "/{id}", name = "getStaffById")
    @Operation(summary = "根据id获取员工信息")
    public CommonResponse getStaffById(@PathVariable("id") String id)
    {
        return CommonResponse.forSuccess("成功获取员工信息",staffService.getStaffById(id));
    }

    @PostMapping(value = "", name = "addStaff")
    @Operation(summary = "添加员工信息")
    public CommonResponse addStaff(@RequestBody Staff staff)
    {
        return CommonResponse.forSuccess("成功添加员工信息",staffService.addStaff(staff));
    }

    @PatchMapping(value = "/{id}", name = "updateStaffById")
    @Operation(summary = "根据id更新员工信息")
    public CommonResponse updateStaffById(@PathVariable("id") String id, @RequestBody Staff staff)
    {
        return CommonResponse.forSuccess("成功更新员工信息",staffService.updateStaffById(id,staff));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "根据id删除员工信息")
    public CommonResponse deleteStaffById(@PathVariable("id") String id)
    {
        Staff staff = staffService.deleteStaffById(id);
        if (staff != null)
            return CommonResponse.forSuccess("成功删除员工信息",staff);
        else
            return CommonResponse.forError("删除失败，员工不存在");
    }
}
