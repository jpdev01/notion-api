package com.jpdev.notion.core.repository;

import com.jpdev.notion.core.domain.calendar.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
