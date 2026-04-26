package com.iov.controller;

import lombok.Getter;

@Getter
public enum Code {
    SAVE_OK(20011),
    DELETE_OK(20021),
    UPDATE_OK(20031),
    GET_OK(20041),
    SAVE_ERR(20010),
    DELETE_ERR(20020),
    UPDATE_ERR(20030),
    GET_ERR(20040),
    SYSTEM_ERR(5000),
    BUSINESS_ERR(4000),
    UNKNOWN_ERR(9999)
    ;
    private final Integer code;
    Code(Integer code) {
        this.code=code;
    }
//    public static Code getByCode(Integer code){
//        if (code==null)return null;
//        for(Code c:Code.values()){
//            if (c.getCode().equals(code)){
//                return c;
//            }
//        }
//        return null;
//    }
}
