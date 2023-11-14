package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("staff")
public class Staff {
    @TableField("staffId")
    private String staffId;
    @TableField("staffName")
    private String staffName;
    @TableField("staffPost")
    private String staffPost; //admin or user
}
