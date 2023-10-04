package com.example.customernotification;

import com.example.customernotification.dao.Notification;
import com.example.customernotification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class CustomerNotificationApplication  {



    public static void main(String[] args) {
     ApplicationContext applicationContext= SpringApplication.run(CustomerNotificationApplication.class, args);




    }


}
