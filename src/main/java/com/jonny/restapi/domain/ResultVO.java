package com.jonny.restapi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultVO {
    private Integer code;
    private String message;


    public ResultVO() {}

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
