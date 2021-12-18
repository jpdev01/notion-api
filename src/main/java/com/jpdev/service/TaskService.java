package com.jpdev.service;

import com.jpdev.domain.calendar.task.Task;
import com.jpdev.dto.TaskDTO;
import com.jpdev.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements BaseService<Task> {

    @Autowired
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

    public Task save(TaskDTO dto) {
        return null;
    }
}
