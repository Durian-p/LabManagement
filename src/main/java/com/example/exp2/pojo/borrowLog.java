package com.example.exp2.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("borrowLog")
public class borrowLog {
    private String borrowId;
    private String supId;
    private String supName;
    private String quantity;
    private String borrowDate;
}
