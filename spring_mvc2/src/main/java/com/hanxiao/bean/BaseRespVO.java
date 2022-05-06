package com.hanxiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/4
 **/

public class BaseRespVO {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Object data;
    String msg;
    Integer errno;

    public static BaseRespVO ok(Object data) {
        return new BaseRespVO(data, "ok", 0);
    }

    public static BaseRespVO ok() {
        return ok(null);
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

    @Override
    public String toString() {
        return "BaseRespVO{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", errno=" + errno +
                '}';
    }

    public BaseRespVO(Object data, String msg, Integer errno) {
        this.data = data;
        this.msg = msg;
        this.errno = errno;
    }

    public BaseRespVO() {
    }
}
