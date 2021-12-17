package com.jpdev.service;

import com.jpdev.domain.calendar.Event;
import com.jpdev.repository.EventRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService implements BaseService<Event> {

    private EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return null;
    }

    @Override
    public Page<Event> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Event get(Integer id) {
        return eventRepository.getById(id);
    }

    @Override
    public void save(Event entity) {

    }
}
