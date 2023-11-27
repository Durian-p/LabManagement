package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("BorrowLog")
@ApiModel
public class BorrowLog
{
    @ApiModelProperty("借用单号")
    @TableId( value = "borrowId" , type = IdType.AUTO)
    private Integer borrowId;
    @ApiModelProperty("物资编号")
    @TableField("suppliesId")
    private String suppliesId;
    @ApiModelProperty("物资名称")
    @TableField("suppliesName")
    private String suppliesName;
    @ApiModelProperty("借用数量")
    private int quantity;
    @ApiModelProperty("借用日期")
    @TableField("borrowDate")
    private String borrowDate;
}
