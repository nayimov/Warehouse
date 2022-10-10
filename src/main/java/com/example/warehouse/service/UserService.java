package com.example.warehouse.service;

import com.example.warehouse.domain.User;
import com.example.warehouse.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public void edit(User user) {
        userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }


}
