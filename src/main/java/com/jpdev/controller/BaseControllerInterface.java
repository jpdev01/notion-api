package com.jpdev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseControllerInterface<T> {

    public ResponseEntity<T> get(Integer id);

    public void put(Integer id, Object object);

    public void delete(Integer id);
}
