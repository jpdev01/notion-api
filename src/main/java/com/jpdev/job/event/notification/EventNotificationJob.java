package com.jpdev.job.event.notification;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EventNotificationJob {

    @Scheduled(cron="0/1 * * * * ?")
    public void validateSomething() {
        System.out.printf("executei");
    }
}

