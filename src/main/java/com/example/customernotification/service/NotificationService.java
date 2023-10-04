package com.example.customernotification.service;

import com.example.customernotification.dao.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final Notification notification;

    public NotificationService(  Notification notification) {
        this.notification = notification;
    }
    public void sendMeassagge(){
        notification.notify1();
    }




}
