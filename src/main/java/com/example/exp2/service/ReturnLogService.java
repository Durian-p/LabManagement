package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.pojo.ReturnLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exp2.mapper.ReturnLogMapper;
import java.util.List;

@Service
public class ReturnLogService {
    private ReturnLogMapper mapper;

    @Autowired
    ReturnLogService(ReturnLogMapper mapper)
    {
        this.mapper = mapper;
    }

    public List getAllReturnLog()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        return mapper.selectList(queryWrapper);
    }

    public ReturnLog getReturnLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        return mapper.selectOne(queryWrapper);
    }

    public Integer addReturnLog(ReturnLog returnLog)
    {
        mapper.insert(returnLog);
        return returnLog.getReturnId();
    }

    public ReturnLog updateReturnLogById(String id, ReturnLog returnLog)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        mapper.update(returnLog,queryWrapper);
        return mapper.selectOne(queryWrapper);
    }

    public ReturnLog deleteReturnLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        ReturnLog returnLog = mapper.selectOne(queryWrapper);
        mapper.delete(queryWrapper);
        return returnLog;
    }
}
