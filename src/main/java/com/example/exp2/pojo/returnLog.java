package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("returnLog")
public class returnLog {
    @TableId( value = "returnId" , type = IdType.AUTO)
    private Integer returnId;
    @TableField("suppliesId")
    private String suppliesId;
    @TableField("suppliesName")
    private String suppliesName;
    private int quantity;
    @TableField("returnDate")
    private String returnDate;
}
