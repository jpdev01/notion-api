package com.jpdev.validation.error;

public class InvalidDomain extends Exception {

    public InvalidDomain(String msg) {
        super(msg);
    }

    public InvalidDomain(String msg, Throwable cause) {
        super(msg, cause);
    }
}
