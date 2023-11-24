package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
}
