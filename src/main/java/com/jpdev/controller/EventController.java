package com.jpdev.controller;

import com.jpdev.domain.calendar.Event;
import com.jpdev.dto.EventDTO;
import com.jpdev.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController<Event> {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Event> get(Long id) {
        return buildResponse(eventService.get(id));
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity<Event> getAllEvents(Long id) {
        return buildResponse(eventService.getAllEvents(id));
    }

    public void put(Integer id, Object object) {

    }

    public void delete(Integer id) {

    }

    public ResponseEntity<Event> save(@RequestBody EventDTO dto) {
        return buildResponse(eventService.save(dto));
    }
}
