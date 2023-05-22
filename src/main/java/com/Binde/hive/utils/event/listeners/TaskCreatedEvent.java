package com.Binde.hive.utils.event.listeners;

import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Task;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TaskCreatedEvent extends ApplicationEvent {
    private final User user;
    private final Task task;
    private final String applicationUrl;

    public TaskCreatedEvent(User user, Task task, String applicationUrl) {
        super(user);
        this.user = user;
        this.task = task;
        this.applicationUrl = applicationUrl;
    }
}
