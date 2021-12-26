package com.jpdev.fix;

import com.jpdev.domain.User;
import com.jpdev.domain.calendar.Event;
import com.jpdev.repository.EventRepository;
import com.jpdev.repository.UserRepository;
import com.jpdev.utils.CustomDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DevelopmentDatabaseFix {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    public void run() {
        if (userRepository.findAll().isEmpty()) {
            User user = new User();
            user.setName("Administrador");
            user.setLogin("adm");
            user.setPassword("adm");
            user.setEmail("adm@gmail.com");
            userRepository.save(user);
        }

//        if (eventRepository.findAll().isEmpty()) {
//            Event event = new Event();
//            event.setOwner(userRepository.getById(Long.valueOf(1)));
//            event.setStartDate(new Date());
//            event.setStartDate(CustomDateUtils.sumDays(new Date(), 1));
//        }
    }
}
