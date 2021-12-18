package com.jpdev.validation;

import java.util.List;

public class CustomError {

    private String code;

    private List arguments;

    public CustomError(String code) {
        this.code = code;
    }

    public CustomError(String code, List arguments) {
        this.code = code;
        this.arguments = arguments;
    }

    public String getMessage() {
        return this.code;
//        if (this.arguments) return MessageUtils.getMessage(this.code, this.arguments)
//        return MessageUtils.getMessage(this.code)
    }
}
