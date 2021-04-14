package ru.rb.dip;

import java.util.List;

public class Notification {

    public void sendNotification() {
        List<Notification> notifications = new NotificationBuilder().createNotifications();
        if (notifications.isEmpty()) {
            throw new IllegalArgumentException("Notification not found");
        }
        final EmailNotificationSender sender = new EmailNotificationSender();
        notifications.forEach(sender::send);
    }
}
