package com.example.exp2.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("returnLog")
public class returnLog {
    private String returnId;
    private String suppliesId;
    private String suppliesName;
    private String quantity;
    private String returnDate;
}
