package com.example.warehouse.controller;

import com.example.warehouse.domain.Product;
import com.example.warehouse.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(productService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.status(200).body(null);
    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        productService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/products/{id}")
    public ResponseEntity<?> edit(@PathVariable Product product){
        productService.edit(product);
        return ResponseEntity.ok(product);
    }



}
