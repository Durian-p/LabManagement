package com.example.exp2.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService
{
    public List getAllStaffs()
    {
        return new ArrayList(){{
            add("张三");
            add("李四");
            add("王五");
        }};
    }
}
