package ru.rb.dip.Impl;


import ru.rb.dip.Notification;
import ru.rb.dip.NotificationBuilder;
import ru.rb.dip.NotificationSender;

import java.util.List;

public class NotificationImpl implements Notification {

    private final NotificationBuilder notificationBuilder;
    private final NotificationSender notificationSender;

    public NotificationImpl(NotificationBuilder notificationBuilder, NotificationSender notificationSender) {
        this.notificationBuilder = notificationBuilder;
        this.notificationSender = notificationSender;
    }

    public void sendNotification() {
        List<NotificationImpl> notifications = notificationBuilder.createNotifications();
        if (notifications.isEmpty()) {
            throw new IllegalArgumentException("Notification not found");
        }
        notifications.forEach(notificationSender::send);
    }
}
