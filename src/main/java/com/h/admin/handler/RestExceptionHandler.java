package com.h.admin.handler;

import com.h.admin.exception.NotFoundException;
import com.h.admin.vo.ErrorVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
@ControllerAdvice
@Slf4j
public class RestExceptionHandler {

    //拦截各种异常封装
    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorVO NotFoundExceptionHandle(NotFoundException e){
        log.error("【not found exception】 code={}, msg={} ",
                e.getCode(), e.getMessage());
        return new ErrorVO(e.getCode(), e.getMessage());
    }

}
