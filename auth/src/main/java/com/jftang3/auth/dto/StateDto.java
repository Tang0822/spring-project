package com.jftang3.auth.dto;

import lombok.Getter;

@Getter
public enum StateDto {

    SUCCESS(200, "请求成功"),
    WRONG(400, "错误的请求"),
    UNAUTHORIZED(401,"用户未登录"),
    FORBIDDEN(403, "禁止访问"),
    UNAVILIABLE(500, "服务器内部错误");

    private Integer code;

    private String message;

    StateDto(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
