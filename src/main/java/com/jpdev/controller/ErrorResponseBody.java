package com.jpdev.controller;

import org.springframework.http.HttpStatus;

public class ErrorResponseBody {

    private String message;

    private HttpStatus status;

    ErrorResponseBody(String message, HttpStatus httpStatus){
        this.message = message;
        this.status = httpStatus;
    }

    ErrorResponseBody(String message){
        this.message = message;
        this.status = HttpStatus.BAD_REQUEST;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
