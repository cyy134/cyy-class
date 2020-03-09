package com.cdes.choose.util;

import lombok.Data;

import java.util.List;

@Data
public class Msg<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;
}
