package com.example.warehouse.controller;

import com.example.warehouse.domain.Warehouse;
import com.example.warehouse.service.WarehouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Warehouse")
public class WarehouseController {
    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(warehouseService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(warehouseService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Warehouse warehouse) {
        warehouseService.edit(warehouse);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/Warehouse/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        warehouseService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/Warehouse/{id}")
    public ResponseEntity<?> edit(@PathVariable Warehouse warehouse) {
        warehouseService.edit(warehouse);
        return ResponseEntity.ok(warehouse);
    }
}
