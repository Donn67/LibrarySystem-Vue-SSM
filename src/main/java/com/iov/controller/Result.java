package com.iov.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private Object data;
    private Integer code;
    private String message;
    public Result(Object data,Integer code){
        this.data=data;
        this.code=code;
    }
}
