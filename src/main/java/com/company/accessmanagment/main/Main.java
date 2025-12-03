package com.company.accessmanagment.main;

import com.company.accessmanagment.config.AppConfig;
import com.company.accessmanagment.model.User;
import com.company.accessmanagment.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService=context.getBean(UserService.class);
        User user1=context.getBean("first",User.class);
        User user2=context.getBean("second",User.class);
        User user3=context.getBean("third",User.class);
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.showAllUser();


    }
}