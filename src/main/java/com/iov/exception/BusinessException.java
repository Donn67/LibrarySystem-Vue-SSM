package com.iov.exception;

import lombok.Data;


@Data
public class BusinessException extends RuntimeException{
    private Integer exceptionCode;



    public BusinessException(String message, Integer exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public BusinessException(String message, Throwable cause, Integer exceptionCode) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }



}
