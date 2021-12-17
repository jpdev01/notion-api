package com.jpdev.controller;

import com.jpdev.domain.calendar.Event;
import com.jpdev.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController<Event> {

    private EventService eventService;

    @Override
    public ResponseEntity<Event> get(Integer id) {
        return buildResponse(eventService.get(id));
    }

    @Override
    public ResponseEntity<Event> save(Object object) {
        return null;
    }

    @Override
    public void put(Integer id, Object object) {

    }

    @Override
    public void delete(Integer id) {

    }

}
