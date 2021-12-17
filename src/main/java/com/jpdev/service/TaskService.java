package com.jpdev.service;

import com.jpdev.domain.calendar.task.Task;
import com.jpdev.repository.TaskRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TaskService implements BaseService<Task> {

    private TaskRepository taskRepository;

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Page<Task> getAll(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    @Override
    public Task get(Integer id) {
        return taskRepository.getById(id);
    }

    @Override
    public Task save(Task entity) {
        return taskRepository.save(entity);
    }
}
