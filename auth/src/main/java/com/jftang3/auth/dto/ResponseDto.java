package com.jftang3.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {

    private Integer code;

    private String message;

    private Object data;

    public ResponseDto(StateDto stateDto, Object data) {
        this.code = stateDto.getCode();
        this.message = stateDto.getMessage();
        this.data = data;
    }

}
