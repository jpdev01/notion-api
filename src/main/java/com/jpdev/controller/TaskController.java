package com.jpdev.controller;

import com.jpdev.domain.calendar.task.Task;
import org.springframework.http.ResponseEntity;

public class TaskController extends BaseController<Task> {

    @Override
    public ResponseEntity<Task> get(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Task> save(Object object) {
        return null;
    }

    @Override
    public void put(Integer id, Object object) {

    }

    @Override
    public void delete(Integer id) {

    }
}
