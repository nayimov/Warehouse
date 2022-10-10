package com.example.warehouse.controller;

import com.example.warehouse.domain.Output;
import com.example.warehouse.service.OutputService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/output")
public class OutputController {
private OutputService outputService;


    public OutputController(OutputService outputService) {
        this.outputService = outputService;
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.status(200).body(outputService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.status(200).body(outputService.getById(id));
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Output output){
        outputService.edit(output);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/output/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        outputService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/output/{id}")
    public ResponseEntity<?> edit(@PathVariable  Output output){
        outputService.edit(output);
        return ResponseEntity.ok(output);
    }

}
