package com.example.warehouse.controller;

import com.example.warehouse.domain.Measurement;
import com.example.warehouse.service.MeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/Measurement")
public class MeasurementController {
    private MeasurementService measurementService;

    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(measurementService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(measurementService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Measurement measurement) {
        measurementService.save(measurement);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/Measurement/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        measurementService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/Measurement/{id}")
    public ResponseEntity<?> edit(@PathVariable Measurement measurement){
        measurementService.edit(measurement);
        return ResponseEntity.ok(measurement);
    }

}
