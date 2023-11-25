package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Data
@TableName("staff")
public class Staff {
    @TableId( value = "staffId" , type = IdType.AUTO)
    private Integer staffId;

    @TableField("staffName")
    private String staffName;

    @TableField("staffPost")
    private String staffPost; //admin or user
}
