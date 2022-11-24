package com.example.warehouse.controller;

import com.example.warehouse.domain.User;
import com.example.warehouse.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(userService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/user/{id}")
    public ResponseEntity<?> edit(@PathVariable User user) {
        userService.edit(user);
        return ResponseEntity.ok(user);
    }
}
