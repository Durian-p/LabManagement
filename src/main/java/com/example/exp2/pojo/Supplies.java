package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("supplies")
public class Supplies {
    @TableField("suppliesId")
    private int suppliesId;
    @TableField("suppliesName")
    private String suppliesName;
    private int quantity;
}
