package com.hailong.spring.advice;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Administrator on 2020/3/1.
 */
@ControllerAdvice
public class HandlerControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String handlerException(RuntimeException e){
        if(e instanceof AccessDeniedException){
            return "redirect:/403.jsp";
        }
        return "redirect:/500.jsp";

    }

}
