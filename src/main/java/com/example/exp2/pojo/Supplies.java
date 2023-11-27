package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("supplies")
@ApiModel
public class Supplies {
    @ApiModelProperty("物资编号")
    @TableId( value = "suppliesId" , type = IdType.AUTO)
    private Integer suppliesId;
    @ApiModelProperty("物资名称")
    @TableField("suppliesName")
    private String suppliesName;
    @ApiModelProperty("物资数量")
    private Integer quantity;
    public Supplies(){

    }

    public Supplies(String suppliesName, int quantity, int suppliesId){
        this.suppliesName = suppliesName;
        this.quantity = quantity;
        this.suppliesId = suppliesId;
    }
}
