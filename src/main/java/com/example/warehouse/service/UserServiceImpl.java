package com.example.warehouse.service;

import com.example.warehouse.domain.Role;
import com.example.warehouse.domain.User;
import com.example.warehouse.repository.RoleRepository;
import com.example.warehouse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements ImployeeService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to database", user.getFirstName());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String firstname, String roleName) {
        log.info("Adding user {} to role {}", firstname, roleName);
        User user = userRepository.findByFirstName(firstname);
        Role role = roleRepository.findByName(roleName);
    }

    @Override
    public User getUser(String firstname) {
        log.info("Fetching user {}", firstname);
        return userRepository.findByFirstName(firstname);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching  all users ");
        return userRepository.findAll();
    }
}
