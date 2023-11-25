package com.example.exp2.Common;
import lombok.Getter;

@Getter
public class CommonResponse<T>
{
    private int code;
    private String msg;
    private T data;

    private CommonResponse(int code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }


    private CommonResponse(int code, String msg, T data)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> CommonResponse<T> forSuccess()
    {
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription());
    }

    public static <T> CommonResponse<T> forSuccessMsg(String msg)
    {
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> CommonResponse<T> forStatusCode(int status)
    {
        return new CommonResponse<>(status,ResponseCode.getDescription(status));
    }

    public static <T> CommonResponse<T> forCommon(int status, String msg, T data)
    {
        return new CommonResponse<>(status,msg,data);
    }

    public static <T>CommonResponse<T> forSuccess(String msg, T data){
        return new CommonResponse<>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T>CommonResponse<T> forError(){
        return new CommonResponse<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDescription());
    }

    public static <T>CommonResponse<T> forError(String msg){
        return new CommonResponse<>(ResponseCode.ERROR.getCode(), msg);
    }
}