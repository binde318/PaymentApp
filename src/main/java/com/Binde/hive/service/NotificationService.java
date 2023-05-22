package com.Binde.hive.service;

import com.Binde.hive.dto.response.NotificationResponseDto;
import com.Binde.hive.entity.User;
import com.Binde.hive.entity.Task;

import java.util.List;

public interface NotificationService {

    NotificationResponseDto taskCreationNotification(Task task, User user);
    NotificationResponseDto taskAcceptanceNotification(Task task, User user);
    NotificationResponseDto doerAcceptanceNotification(Task task, User user);

    List<NotificationResponseDto> getAllNotificationOfUser(String email);
}
