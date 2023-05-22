package com.Binde.hive.utils.event.listeners;

import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Task;
import com.Binde.hive.exceptions.CustomException;
import com.Binde.hive.service.implementation.NotificationServiceImpl;
import com.Binde.hive.utils.event.TaskAcceptedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;

@RequiredArgsConstructor
@Log4j2
public class TaskAcceptedEventListener implements ApplicationListener<TaskAcceptedEvent> {

    private final NotificationServiceImpl notificationService;

    @Override
    public void onApplicationEvent(TaskAcceptedEvent event) {
        User user = event.getUser();
        Task task = event.getTask();

        try {
            notificationService.taskAcceptanceNotification(task, user);
            notificationService.doerAcceptanceNotification(task, user);

        } catch (CustomException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
