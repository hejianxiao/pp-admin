package com.h.admin.exception;

import com.h.admin.constant.ErrorEnum;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
public class NotFoundException extends GlobalException{


    public NotFoundException(ErrorEnum resultEnum) {
        super(resultEnum);
    }
}
