package com.example.exp2.common;

import lombok.Getter;

@Getter
public enum ResponseCode {

    SUCCESS(1,"SUCCESS"),
    ERROR(0,"ERROR");

    private final int code;
    private final String description;

    ResponseCode(int status,String description){
        this.code = status;
        this.description = description;
    }

    public static String getDescription(int code) {
        for (ResponseCode c : ResponseCode.values()) {
            if (c.getCode() == code) {
                return c.description;
            }
        }
        return null;
    }
}
