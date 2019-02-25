package com.h.admin.constant;

import lombok.Getter;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
@Getter
public enum ErrorEnum {

    USER_EMPTY(40401, "用户不存在");

    private Integer code;
    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
