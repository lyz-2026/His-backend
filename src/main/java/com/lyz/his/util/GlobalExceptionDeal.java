package com.lyz.his.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lyz.his.po.ResponseBean;

//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice
public class GlobalExceptionDeal
{

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseBean dealNullPointerException()
    {
        ResponseBean rb = new ResponseBean<>("出现空指针异常", 501);
        return rb;

    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseBean dealUnexpectedException()
    {
        ResponseBean rb = new ResponseBean<>("出现未知", 505);
        return rb;

    }
}
