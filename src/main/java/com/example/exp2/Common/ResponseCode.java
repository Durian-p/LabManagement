package com.example.exp2.Common;

import lombok.Getter;

@Getter
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR");

    private final int status;
    private final String description;

    ResponseCode(int status, String description){
        this.status = status;
        this.description = description;
    }
}
