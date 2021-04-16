package ru.rb.dip.Impl;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.rb.dip.Notification;
import ru.rb.dip.NotificationBuilder;
import ru.rb.dip.NotificationSender;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
class NotificationImplTest {
    @Mock
    NotificationBuilder notificationBuilder;
    @Mock
    NotificationSender notificationSender;


    @Test
    void sendNotification() {
        Mockito.when(notificationBuilder.createNotifications()).thenReturn(new ArrayList<>());
        Notification notification = new NotificationImpl(notificationBuilder, notificationSender);
        Assertions.assertThrows(IllegalArgumentException.class,()->notification.sendNotification());
    }
}