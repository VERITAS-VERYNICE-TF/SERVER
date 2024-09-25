package com.example.ssuitfestival.common;

import lombok.Data;

@Data
public class CommonResponse<T> {
    private String statusCode;
    private T data;
    private String message;

    public CommonResponse(String statusCode, T data, String message) {
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }
}
