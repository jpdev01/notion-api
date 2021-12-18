package com.jpdev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseController<T> {

    public ResponseEntity<T> buildResponse() {
        return buildResponse(HttpStatus.OK);
    }

    public ResponseEntity<T> buildResponse(T entity) {
        if (entity == null) return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<T>(entity, HttpStatus.OK);
    }

    public ResponseEntity<T> buildResponse(HttpStatus status) {
        return new ResponseEntity<T>(status);
    }

    public ResponseEntity<T> buildResponse(T entity, HttpStatus status) {
        return new ResponseEntity<T>(entity, status);
    }
}
