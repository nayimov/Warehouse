package com.example.warehouse.service;

import com.example.warehouse.domain.Role;
import com.example.warehouse.domain.User;

import java.util.List;

public interface ImployeeService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

}
