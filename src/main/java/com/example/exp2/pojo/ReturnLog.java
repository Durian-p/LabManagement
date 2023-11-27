package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("ReturnLog")
@ApiModel
public class ReturnLog
{
    @ApiModelProperty("归还单号")
    @TableId( value = "returnId" , type = IdType.AUTO)
    private Integer returnId;
    @ApiModelProperty("物资编号")
    @TableField("suppliesId")
    private String suppliesId;
    @ApiModelProperty("物资名称")
    @TableField("suppliesName")
    private String suppliesName;
    @ApiModelProperty("归还数量")
    private int quantity;
    @ApiModelProperty("归还日期")
    @TableField("returnDate")
    private String returnDate;
}
