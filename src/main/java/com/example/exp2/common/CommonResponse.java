package com.example.exp2.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {
    private int status;
    private String msg;
    private T data;

    private CommonResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }


    private CommonResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T>CommonResponse<T> forSuccess(){
        return new CommonResponse<>(ResponseCode.SUCCESS.getStatus(),ResponseCode.SUCCESS.getDescription());
    }

    public static <T>CommonResponse<T> forSuccessMsg(String msg){
        return new CommonResponse<>(ResponseCode.SUCCESS.getStatus() , msg);
    }

    public static <T>CommonResponse<T> forSuccess(T data){
        return new CommonResponse<>(ResponseCode.SUCCESS.getStatus(), ResponseCode.SUCCESS.getDescription(), data);
    }
    public static <T>CommonResponse<T> forSuccess(String msg,T data){
        return new CommonResponse<>(ResponseCode.SUCCESS.getStatus(), msg, data);
    }

    public static <T>CommonResponse<T> forError(){
        return new CommonResponse<>(ResponseCode.ERROR.getStatus(), ResponseCode.ERROR.getDescription());
    }

    public static <T>CommonResponse<T> forError(String msg){
        return new CommonResponse<>(ResponseCode.ERROR.getStatus(), msg);
    }
}
