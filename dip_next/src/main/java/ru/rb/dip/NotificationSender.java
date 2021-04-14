package ru.rb.dip;

import ru.rb.dip.Impl.NotificationImpl;

public interface NotificationSender {
    void send(final NotificationImpl notification);
}
