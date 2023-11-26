package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("supplies")
public class Supplies {
    @TableId( value = "suppliesId" , type = IdType.AUTO)
    private Integer suppliesId;
    @TableField("suppliesName")
    private String suppliesName;
    private Integer quantity;
    public Supplies(){

    }

    public Supplies(String suppliesName, int quantity, int suppliesId){
        this.suppliesName = suppliesName;
        this.quantity = quantity;
        this.suppliesId = suppliesId;
    }
}
