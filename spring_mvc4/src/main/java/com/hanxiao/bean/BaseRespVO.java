package com.hanxiao.bean;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/9
 **/

public class BaseRespVO {

    private Object data;
    private String msg;
    private Integer errno;


    public static BaseRespVO fail(Object data) {
        return new BaseRespVO(data, "fail", 500);
    }

    public static BaseRespVO fail() {
        return fail(null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public BaseRespVO() {
    }

    public BaseRespVO(Object data, String msg, Integer errno) {
        this.data = data;
        this.msg = msg;
        this.errno = errno;
    }

    public static BaseRespVO ok() {
        return ok(null);
    }

    public static BaseRespVO ok(Object data) {
        return new BaseRespVO(data, "ok", 0);
    }
}
