package com.jpdev.controller;

import com.jpdev.domain.BaseEntity;
import com.jpdev.utils.DomainUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseController<T extends BaseEntity> {

    public ResponseEntity buildResponse() {
        return buildResponse(HttpStatus.OK);
    }

    public ResponseEntity buildResponse(T entity) {
        if (entity == null) return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
        if (entity.hasErrors()) return new ResponseEntity(new ErrorResponseBody(DomainUtils.getFirstErrorMessage(entity)), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<T>(entity, HttpStatus.OK);
    }

    public ResponseEntity buildResponse(HttpStatus status) {
        return new ResponseEntity<T>(status);
    }

    public ResponseEntity buildResponse(T entity, HttpStatus status) {
        if (entity.hasErrors())  return new ResponseEntity<>("oi", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<T>(entity, status);
    }
}
