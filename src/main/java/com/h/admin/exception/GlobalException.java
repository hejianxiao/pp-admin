package com.h.admin.exception;

import com.h.admin.constant.ErrorEnum;
import lombok.Getter;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
@Getter
public class GlobalException extends RuntimeException{

    private Integer code;

    public GlobalException(ErrorEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public GlobalException(ErrorEnum resultEnum, String msg) {
        super(msg);
        this.code = resultEnum.getCode();
    }

}
