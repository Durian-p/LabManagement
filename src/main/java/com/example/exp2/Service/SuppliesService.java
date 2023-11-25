package com.example.exp2.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.exp2.Mapper.SuppliesMapper;
import com.example.exp2.pojo.Supplies;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@MapperScan("com.example.exp2.Mapper")
public class SuppliesService {
    private SuppliesMapper SuppliesMapper;
    @Autowired
    public SuppliesService(SuppliesMapper suppliesMapper){
        this.SuppliesMapper = suppliesMapper;
    }
    // get supplies List with no params
    public List<Supplies> getSuppliesList(){
        QueryWrapper<Supplies> queryWrapper = new QueryWrapper<>();
        return SuppliesMapper.selectList(queryWrapper);
    }

    public boolean updateSuppliesById(String suppliesName, int quantity, int suppliesId) {
        Supplies supplies = new Supplies(suppliesName, quantity, suppliesId);
        return SuppliesMapper.updateById(supplies) > 0;
    }
}
