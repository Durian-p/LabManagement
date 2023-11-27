package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Data
@ApiModel
@TableName("staff")
public class Staff {
    @ApiModelProperty("员工id")
    @TableId( value = "staffId" , type = IdType.AUTO)
    private Integer staffId;

    @ApiModelProperty("员工姓名")
    @TableField("staffName")
    private String staffName;

    @ApiModelProperty("员工性别")
    @TableField("staffPost")
    private String staffPost; //admin or user
}
