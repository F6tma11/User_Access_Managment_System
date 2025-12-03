package com.company.accessmanagment.service;

import com.company.accessmanagment.model.User;
import org.springframework.stereotype.Service;

@Service
public class EmailNotifications implements NotificationService{
    @Override
    public void sendNotifications(User user) {
        System.out.println("Send email notification "+user.getUsername());
    }
}
