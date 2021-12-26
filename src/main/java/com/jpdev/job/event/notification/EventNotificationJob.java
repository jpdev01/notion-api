package com.jpdev.job.event.notification;

import com.jpdev.domain.async.AsyncAction;
import com.jpdev.domain.def.async.AsyncActionStatus;
import com.jpdev.domain.def.async.AsyncActionType;
import com.jpdev.repository.AsyncActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventNotificationJob {

    @Autowired
    private AsyncActionRepository asyncActionRepository;

    @Scheduled(cron="0/1 * * * * ?")
    public void execute() {
        List<AsyncAction> asyncActionList = asyncActionRepository.findAsyncActionByStatus(AsyncActionType.EVENT_NOTIFICATION, AsyncActionStatus.PENDING);
    }
}

