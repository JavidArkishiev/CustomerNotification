package com.example.customernotification.service;

import com.example.customernotification.dao.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final Notification notification;

    public NotificationService( @Qualifier("smsNotificationService") Notification notification) {
        this.notification = notification;
    }





}
