package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("returnLog")
public class returnLog {
    @TableField("returnId")
    private String returnId;
    @TableField("suppliesId")
    private String suppliesId;
    @TableField("suppliesName")
    private String suppliesName;
    private int quantity;
    @TableField("returnDate")
    private String returnDate;
}
