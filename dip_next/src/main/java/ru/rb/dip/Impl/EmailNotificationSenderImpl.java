package ru.rb.dip.Impl;


import ru.rb.dip.NotificationSender;

public class EmailNotificationSenderImpl implements NotificationSender {
    public void send(final NotificationImpl notification) {
        System.out.println("Send Email");
    }
}
