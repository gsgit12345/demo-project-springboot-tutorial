package com.aws.demo.exception;

public class ErrorResponse {
    int statusCode;
    String message;
    public ErrorResponse(int statusCode,String message)
    {
        this.statusCode=statusCode;
        this.message=message;

    }
}
