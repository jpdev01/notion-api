package com.jpdev.notion.core.domain.calendar.task;

import com.jpdev.notion.core.domain.calendar.base.EventBase;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task extends EventBase {

    @OneToMany
    private List<SubTask> subTasks;

    private String activityDescription;
}
