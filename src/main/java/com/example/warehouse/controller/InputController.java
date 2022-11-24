package com.example.warehouse.controller;

import com.example.warehouse.domain.Input;
import com.example.warehouse.service.InputService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/input")
public class InputController {

    private InputService inputService;


    public InputController(InputService inputService) {
        this.inputService = inputService;
    }

    @GetMapping
    private ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(inputService.getAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getBYId(@PathVariable Long id) {
        return ResponseEntity.status(200).body(inputService.getById(id));
    }

    @PostMapping
    private ResponseEntity<?> save(@RequestBody Input input) {
        inputService.save(input);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/input/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        inputService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/input/{id}")
    public ResponseEntity<?> edit(@PathVariable Input input) {
        inputService.edit(input);
        return ResponseEntity.ok(input);
    }

}
