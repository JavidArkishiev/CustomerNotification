package com.example.customernotification.service;

import com.example.customernotification.dao.Notification;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class EmailNotificationService implements Notification {

    @Override
    public String notify1() {
        return "This email invalid";
    }
}
