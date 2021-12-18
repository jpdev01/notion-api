package com.jpdev.controller;

import com.jpdev.domain.calendar.task.Task;
import com.jpdev.dto.TaskDTO;
import com.jpdev.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController extends BaseController<Task> {

    @Autowired
    private TaskService taskService;

    public ResponseEntity<Task> get(Integer id) {
        return null;
    }

    public ResponseEntity<Task> save(Task task) {
        return null;
    }

    public void put(Integer id, Object object) {

    }

    public void delete(Integer id) {

    }

    public ResponseEntity<Task> save(@RequestBody TaskDTO dto) {
        return buildResponse(taskService.save(dto));
    }
}
