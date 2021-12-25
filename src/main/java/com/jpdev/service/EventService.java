package com.jpdev.service;

import com.jpdev.domain.calendar.Event;
import com.jpdev.dto.EventDTO;
import com.jpdev.repository.EventRepository;
import com.jpdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements BaseServiceInterface<Event> {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Page<Event> getAll(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

    @Override
    public Event get(Long id) {
        return eventRepository.getById(id);
    }

    public List<Event> getAllEvents(Long userId) {
        return eventRepository.findByOwnerId(userId);
    }

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
