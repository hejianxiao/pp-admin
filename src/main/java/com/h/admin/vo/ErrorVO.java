package com.h.admin.vo;

import lombok.Data;

/**
 * 创建人: Hjx
 * Date: 2019/2/25
 * Description:
 */
@Data
public class ErrorVO {
    /**
     * 自定义错误码
     */
    private int code;

    /**
     * 错误内容
     */
    private String err;

    public ErrorVO(int code, String err) {
        this.code = code;
        this.err = err;
    }
}
