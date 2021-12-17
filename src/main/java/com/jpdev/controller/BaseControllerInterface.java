package com.jpdev.controller;

import org.springframework.http.ResponseEntity;

public interface BaseControllerInterface<T> {

    public ResponseEntity<T> get(Integer id);

    public ResponseEntity<T> save(Object object);

    public void put(Integer id, Object object);

    public void delete(Integer id);
}
