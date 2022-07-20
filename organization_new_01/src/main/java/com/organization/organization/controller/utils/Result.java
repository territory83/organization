package com.organization.organization.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

    private boolean flag;

    private int code;

    private String msg;

    private Object data;



    //读取数据成功
    public static Result success(Object data) {
        return new Result(true, 200, "message", data);
    }

    //读取数据失败
    public static Result fail(int code, String msg) {
        return new Result(false, code, msg, null);
    }
}
