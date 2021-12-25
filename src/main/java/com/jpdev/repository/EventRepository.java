package com.jpdev.repository;

import com.jpdev.domain.calendar.Event;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends EventBaseRepository<Event> {

}
