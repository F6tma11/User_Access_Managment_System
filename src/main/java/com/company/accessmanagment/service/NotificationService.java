package com.company.accessmanagment.service;

import com.company.accessmanagment.model.User;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {

    public void sendNotifications(User user);
}
