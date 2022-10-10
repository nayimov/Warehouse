package com.example.warehouse.controller;

import com.example.warehouse.domain.Category;
import com.example.warehouse.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    private ResponseEntity<?> getAll(){
        return ResponseEntity.status(200).body(categoryService.getAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getBYId(@PathVariable Long id){
        return ResponseEntity.status(200).body(categoryService.getById(id));
    }
    @PostMapping
    private ResponseEntity<?> save(@RequestBody Category category){
        categoryService.save(category);
        return   ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/Category/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        categoryService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/Category/{id}")
    public ResponseEntity<?> edit(@PathVariable Category category){
        categoryService.edit(category);
        return ResponseEntity.ok(category);
    }
}
