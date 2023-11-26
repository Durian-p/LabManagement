package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("borrowLog")
public class borrowLog {
    @TableId( value = "borrowId" , type = IdType.AUTO)
    private Integer borrowId;
    @TableField("suppliesId")
    private String suppliesId;
    @TableField("suppliesName")
    private String suppliesName;
    private int quantity;
    @TableField("borrowDate")
    private String borrowDate;
}
