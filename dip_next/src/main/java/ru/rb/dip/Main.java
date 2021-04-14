package ru.rb.dip;


import ru.rb.dip.Impl.EmailNotificationSenderImpl;
import ru.rb.dip.Impl.NotificationBuilderImpl;
import ru.rb.dip.Impl.NotificationImpl;

public class Main {

    public static void main(String[] args) {
        final NotificationBuilder notificationBuilder = new NotificationBuilderImpl();
        final NotificationSender notificationSender = new EmailNotificationSenderImpl();
        final Notification notification = new NotificationImpl(notificationBuilder, notificationSender);
        notification.sendNotification();
    }
}
