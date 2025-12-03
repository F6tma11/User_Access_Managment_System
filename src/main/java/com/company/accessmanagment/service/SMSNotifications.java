package com.company.accessmanagment.service;

import com.company.accessmanagment.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSNotifications implements NotificationService {
    @Override
    public void sendNotifications(User user) {
        System.out.println("Send SMS notification for " + user.getUsername());
    }
}
