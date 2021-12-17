package com.jpdev.service;

import com.jpdev.domain.calendar.task.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class TaskService implements BaseService<Task> {

    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public Page<Task> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Task> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Task entity) {

    }
}
