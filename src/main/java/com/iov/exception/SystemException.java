package com.iov.exception;

import lombok.Data;



@Data
public class SystemException extends RuntimeException{
    private Integer exceptionCode;



    public SystemException(String message, Integer exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public SystemException(String message, Throwable cause, Integer exceptionCode) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }



}
