package com.company.accessmanagment.service;

import com.company.accessmanagment.model.Permission;
import com.company.accessmanagment.model.Role;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class RoleService {

    public void showPermissions(Role role){
        System.out.println("User permession is : ");
        Set<Permission>permissions=role.getPermissions();
        for (Permission perme:permissions) {
            System.out.print(perme.getName()+"  ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");

    }
}
