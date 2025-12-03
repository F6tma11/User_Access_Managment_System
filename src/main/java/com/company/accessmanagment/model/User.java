package com.company.accessmanagment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class User {

    private int id;
    private String username;
    private Role userRole;
    private String password;

    @Autowired
    public User(int id, String username, Role userRole, String password) {
        this.id = id;
        this.username = username;
        this.userRole = userRole;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
