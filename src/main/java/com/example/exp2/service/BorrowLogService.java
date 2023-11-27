package com.example.exp2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.pojo.BorrowLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exp2.mapper.BorrowLogMapper;
import java.util.List;

@Service
public class BorrowLogService {
    private BorrowLogMapper mapper;

    @Autowired
    BorrowLogService(BorrowLogMapper mapper)
    {
        this.mapper = mapper;
    }

    public List getAllBorrowLog()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        return mapper.selectList(queryWrapper);
    }

    public BorrowLog getBorrowLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        return mapper.selectOne(queryWrapper);
    }

    public Integer addBorrowLog(BorrowLog borrowLog)
    {
        mapper.insert(borrowLog);
        return borrowLog.getBorrowId();
    }

    public BorrowLog updateBorrowLogById(String id, BorrowLog borrowLog)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        mapper.update(borrowLog,queryWrapper);
        return mapper.selectOne(queryWrapper);
    }

    public BorrowLog deleteBorrowLogById(String id)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("borrowId",id);
        BorrowLog borrowLog = mapper.selectOne(queryWrapper);
        mapper.delete(queryWrapper);
        return borrowLog;
    }
}
