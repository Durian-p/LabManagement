package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exp2.Mapper.StaffMapper;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService
{
    private StaffMapper mapper;

    @Autowired
    StaffService(StaffMapper mapper)
    {
        this.mapper = mapper;
    }

    public List getAllStaffs()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        return mapper.selectList(queryWrapper);
    }

    public Staff getStaffById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("staffId",id);
        return mapper.selectOne(queryWrapper);
    }

    public Integer addStaff(Staff staff)
    {
        mapper.insert(staff);
        return staff.getStaffId();
    }

    public Staff updateStaffById(String id, Staff staff)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("staffId",id);
        mapper.update(staff,queryWrapper);
        return mapper.selectOne(queryWrapper);
    }

    public Staff deleteStaffById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("staffId",id);
        Staff staff = mapper.selectOne(queryWrapper);
        mapper.delete(queryWrapper);
        return staff;
    }
}
