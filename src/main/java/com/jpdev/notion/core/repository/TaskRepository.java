package com.jpdev.notion.core.repository;

import com.jpdev.notion.core.domain.calendar.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
