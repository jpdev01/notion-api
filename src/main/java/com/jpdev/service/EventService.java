package com.jpdev.service;

import com.jpdev.domain.calendar.Event;
import com.jpdev.dto.EventDTO;
import com.jpdev.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements BaseService<Event> {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Page<Event> getAll(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

    @Override
    public Event get(Integer id) {
        return eventRepository.getById(id);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public Event save(EventDTO dto) {
        return null;
    }

    private Event parseEvent(EventDTO eventDTO){
        Event event = new Event();
        return event;
    }
}
