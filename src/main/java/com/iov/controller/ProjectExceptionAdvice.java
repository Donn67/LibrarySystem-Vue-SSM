package com.iov.controller;

import com.iov.exception.BusinessException;
import com.iov.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException systemException){
        return new Result(null,
                systemException.getExceptionCode(),
                systemException.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException businessException){
        return new Result(null,
                businessException.getExceptionCode(),
                businessException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){

        return new Result(null,Code.UNKNOWN_ERR.getCode(),"系统繁忙，请稍后再试");
    }


}
