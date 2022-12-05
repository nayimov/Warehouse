package com.example.warehouse.service;

import com.example.warehouse.domain.User;
import com.example.warehouse.repository.UserRepository;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final SimpMessagingTemplate simpMessagingTemplate;
    public UserService(UserRepository userRepository,SimpMessagingTemplate simpMessagingTemplate) {
        this.userRepository = userRepository;
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void edit(User user) {
        userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
    public void typing(String message) {
        simpMessagingTemplate.convertAndSend("/topic/type",message);
    }

    public void keydown (String message){
        simpMessagingTemplate.convertAndSend("/topic/keydown",message);
    }
}
