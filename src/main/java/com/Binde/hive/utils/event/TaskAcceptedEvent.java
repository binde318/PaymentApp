package com.Binde.hive.utils.event;

import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Task;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TaskAcceptedEvent extends ApplicationEvent {

    private final User user;
    private final Task task;

    public TaskAcceptedEvent(User user, Task task) {
        super(user);
        this.user = user;
        this.task =task;
    }

}
