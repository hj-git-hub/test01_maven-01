package com.smart.app.resp;

public class BaseResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> BaseResponseEntity success(T data){
        return success(200,"success",data);
    }
    public static <T> BaseResponseEntity success(int status,String msg,T data){
        BaseResponseEntity bre = new BaseResponseEntity();
        bre.setStatus(status);
        bre.setMsg(msg);
        bre.setData(data);
        return bre;
    }

    public static <T> BaseResponseEntity error(){
        return error(404,"error");
    }
    public static <T> BaseResponseEntity error(int status,String msg){
        BaseResponseEntity bre = new BaseResponseEntity();
        bre.setStatus(status);
        bre.setMsg(msg);
        return bre;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
