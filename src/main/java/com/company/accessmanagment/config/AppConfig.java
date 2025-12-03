package com.company.accessmanagment.config;
import com.company.accessmanagment.model.Permission;
import com.company.accessmanagment.model.Role;
import com.company.accessmanagment.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan(basePackages = {"com.company.accessmanagment.model"
        ,"com.company.accessmanagment.repository","com.company.accessmanagment.service"})
public class AppConfig {

    @PostConstruct
    public void init(){
        System.out.println("Hello users we start system");
    }

    @Bean
    public Role admin(){
        Role role=new Role();
        role.setName("ADMIN");
        role.setPermissions(Set.of(readUSers(),DeleteUsers(),addUsers(),showTask(),sendNoti()));
        return role;
    }

    @Bean
    public Role employee(){
        Role role=new Role();
        role.setName("EMPLOYEE");
        role.setPermissions(Set.of(readUSers(),showTask()));
        return role;
    }

    @Bean
    public Role manager(){
        Set<Permission> permissions=new HashSet<>();
        permissions.add(readUSers());
        permissions.add(showTask());
        permissions.add(sendNoti());
        Role role=new Role();
        role.setName("MANAGER");
        role.setPermissions(permissions);
        return role;
    }

    @Bean
    public Permission readUSers(){
        return new Permission("READ_USER");
    }

    @Bean
    public Permission showTask(){
        return new Permission("SHOW_TASK");
    }

    @Bean
    public Permission addUsers(){
        return new Permission("ADD_USER");
    }

    @Bean
    public Permission DeleteUsers(){
        return new Permission("DELETE_USER");
    }

    @Bean
    public Permission sendNoti(){
        return new Permission("SEND_NOTIFICATIONS");
    }

    @Bean()
    public User first(){
        User user=new User(1,"FatmaAhmed", admin(),"@fatma611");
        return user;
    }

    @Bean
    public User second(){
        User user=new User(2,"AliMohammed",employee(),"@ahi344");
        return user;
    }

    @Bean
    public User third(){
        User user=new User(3,"Ahmed",manager(),"@ahmed344");
        return user;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Now the system end.");
    }
}
