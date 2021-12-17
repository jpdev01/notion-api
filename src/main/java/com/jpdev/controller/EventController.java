package com.jpdev.controller;

import com.jpdev.domain.calendar.Event;
import com.jpdev.dto.EventDTO;
import com.jpdev.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
    public void put(Integer id, Object object) {

    }

    @Override
    public void delete(Integer id) {

    }

    public ResponseEntity<Event> save(@RequestBody EventDTO dto) {
        return buildResponse(eventService.save(dto));
    }
}
