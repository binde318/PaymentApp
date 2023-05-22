package com.Binde.hive.repository;

import com.Binde.hive.entity.Notification;
import com.Binde.hive.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, String> {

    List<Notification> findNotificationsByUserOrderByCreatedAtDesc(User user);
}

