package com.example.warehouse.controller;

import com.example.warehouse.domain.Product;
import com.example.warehouse.domain.Supplier;
import com.example.warehouse.service.SupplierService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {
        private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }


    @GetMapping()
        public ResponseEntity<?> getAll() {
            return ResponseEntity.status(200).body(supplierService.getAll());
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> getById(@PathVariable Long id) {
            return ResponseEntity.status(200).body(supplierService.getById(id));
        }

        @PostMapping
        public ResponseEntity<?> saveClient(@RequestBody Supplier supplier) {
            supplierService.save(supplier);
            return ResponseEntity.status(200).body(null);
        }

    @DeleteMapping("/suppliers/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        supplierService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/suppliers/{id}")
    public ResponseEntity<?> edit(@PathVariable  Supplier supplier){
        supplierService.edit(supplier);
        return ResponseEntity.ok(supplier);
    }

}
