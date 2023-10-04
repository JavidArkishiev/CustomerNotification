package com.example.customernotification.service;

import com.example.customernotification.dao.Notification;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements Notification {

    @Override
    public String notify1() {
        return "This is email";
    }
}
