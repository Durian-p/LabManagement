package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Supplies")
public class Supplies {
    private String suppliesId;
    private String suppliesName;
    private String quantity;
}
