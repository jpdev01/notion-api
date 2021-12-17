package com.jpdev.service;

import com.jpdev.domain.calendar.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService implements BaseService<Event> {

    @Override
    public List<Event> getAll() {
        return null;
    }

    @Override
    public Page<Event> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Event> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Event entity) {

    }
}
