package com.company.accessmanagment.service;

import com.company.accessmanagment.model.User;
import com.company.accessmanagment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private NotificationService notificationService;
    private UserRepository userRepository;
    private RoleService roleService;

    @Autowired
    public  UserService(NotificationService notificationService,UserRepository userRepository,RoleService roleService){
        this.notificationService=notificationService;
        this.userRepository=userRepository;
        this.roleService=roleService;
    }

    public void addUser(User user){
        userRepository.addUser(user);
        notificationService.sendNotifications(user);
    }

    public void showAllUser(){
        List<User>user=userRepository.getAllUser();
        for (int l = 0; l < user.size(); l++) {
            System.out.println("User id : "+user.get(l).getId()+" name : "+user.get(l).getUsername()
                    +" role "+user.get(l).getUserRole().getName()+" password : "+user.get(l).getPassword()
                    );
            roleService.showPermissions(user.get(l).getUserRole());
        }
    }

    public void sendNotification(User user){
        notificationService.sendNotifications(user);
    }
}
