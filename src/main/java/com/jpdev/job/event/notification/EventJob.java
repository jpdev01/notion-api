package com.jpdev.job.event.notification;

import com.jpdev.domain.async.AsyncAction;
import com.jpdev.domain.calendar.Event;
import com.jpdev.domain.def.async.AsyncActionStatus;
import com.jpdev.repository.AsyncActionRepository;
import com.jpdev.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EventJob {

    @Autowired
    private EventRepository eventRepository;

    @Scheduled(cron="0/1 * * * * ?")
    public void execute() {
       List<Event> events = eventRepository.findAll();
    }
    
}
