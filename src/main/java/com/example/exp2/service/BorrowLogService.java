package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.pojo.borrowLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exp2.mapper.borrowLogMapper;
import java.util.List;

@Service
public class BorrowLogService {
    private borrowLogMapper mapper;

    @Autowired
    BorrowLogService(borrowLogMapper mapper)
    {
        this.mapper = mapper;
    }

    public List getAllBorrowLog()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        return mapper.selectList(queryWrapper);
    }

    public borrowLog getBorrowLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        return mapper.selectOne(queryWrapper);
    }

    public Integer addBorrowLog(borrowLog borrowLog)
    {
        mapper.insert(borrowLog);
        return borrowLog.getBorrowId();
    }

    public borrowLog updateBorrowLogById(String id, borrowLog borrowLog)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        mapper.update(borrowLog,queryWrapper);
        return mapper.selectOne(queryWrapper);
    }

    public borrowLog deleteBorrowLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        borrowLog borrowLog = mapper.selectOne(queryWrapper);
        mapper.delete(queryWrapper);
        return borrowLog;
    }
}
