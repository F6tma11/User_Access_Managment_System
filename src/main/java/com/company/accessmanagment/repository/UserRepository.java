package com.company.accessmanagment.repository;

import com.company.accessmanagment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User>users=new ArrayList<>();


    public void addUser(User user){
        users.add(user);
    }

    public List<User> getAllUser(){
        return users;
    }


}
