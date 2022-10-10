package com.example.warehouse.controller;

import com.example.warehouse.domain.Input;
import com.example.warehouse.domain.InputProduct;
import com.example.warehouse.service.InputProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/InputProduct")
public class InputProductController {
    private InputProductService inputProductService;

    public InputProductController(InputProductService inputProductService) {
        this.inputProductService = inputProductService;
    }
    @GetMapping
    private ResponseEntity<?> getAll(){
        return ResponseEntity.status(200).body(inputProductService.getAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getBYId(@PathVariable Long id){
        return ResponseEntity.status(200).body(inputProductService.getById(id));
    }
    @PostMapping
    private ResponseEntity<?> save(@RequestBody InputProduct inputProduct){
        inputProductService.save(inputProduct);
        return   ResponseEntity.status(200).body(null);
    }
    @DeleteMapping("/InputProduct/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        inputProductService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/InputProduct/{id}")
    public ResponseEntity<?> edit(@PathVariable InputProduct inputProduct){
        inputProductService.edit(inputProduct);
        return ResponseEntity.ok(inputProduct);
    }
}
