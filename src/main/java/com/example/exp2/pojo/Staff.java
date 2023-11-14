package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Staff")
public class Staff {
    private String staffId;
    private String staffName;
    private String staffPost; //admin or user
}
