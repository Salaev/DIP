package ru.rb.dip;

import ru.rb.dip.Impl.NotificationImpl;

import java.util.List;

public interface NotificationBuilder {
    List<NotificationImpl> createNotifications();
}
