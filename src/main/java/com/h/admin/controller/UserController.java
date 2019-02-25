package com.h.admin.controller;

import com.h.admin.constant.ErrorEnum;
import com.h.admin.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public Object login() {
        throw new NotFoundException(ErrorEnum.USER_EMPTY);
    }

}
