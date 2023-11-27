package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.pojo.returnLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exp2.mapper.returnLogMapper;
import java.util.List;

@Service
public class ReturnLogService {
    private returnLogMapper mapper;

    @Autowired
    ReturnLogService(returnLogMapper mapper)
    {
        this.mapper = mapper;
    }

    public List getAllReturnLog()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        return mapper.selectList(queryWrapper);
    }

    public returnLog getReturnLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        return mapper.selectOne(queryWrapper);
    }

    public Integer addReturnLog(returnLog returnLog)
    {
        mapper.insert(returnLog);
        return returnLog.getReturnId();
    }

    public returnLog updateReturnLogById(String id, returnLog returnLog)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        mapper.update(returnLog,queryWrapper);
        return mapper.selectOne(queryWrapper);
    }

    public returnLog deleteReturnLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("returnId",id);
        returnLog returnLog = mapper.selectOne(queryWrapper);
        mapper.delete(queryWrapper);
        return returnLog;
    }
}
