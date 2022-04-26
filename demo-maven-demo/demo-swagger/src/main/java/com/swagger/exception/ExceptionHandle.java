package com.swagger.exception;

import com.swagger.utils.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.ServletException;

/**
 * 统一异常处理
 */
@RestControllerAdvice
@Slf4j
public class ExceptionHandle {
    /**
     * 自定义异常e
     * @param e 异常
     * @return responsebean
     */
    @ExceptionHandler(value = ServletException.class)
    public ResponseBean handle(ServletException e){
        log.error(e.getMessage(),e);
        return ResponseBean.error(e.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    public ResponseBean handleException(Throwable ex) {
        log.error(ex.getMessage(), ex);
        return ResponseBean.error(ex.getMessage(), "500");
    }
}
