package com.example.warehouse.controller;

import com.example.warehouse.domain.Output;
import com.example.warehouse.domain.OutputProduct;
import com.example.warehouse.service.OutputProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/outputProduct")
public class OutputProductController {
    private OutputProductService outputProductService;

    public OutputProductController(OutputProductService outputProductService) {
        this.outputProductService = outputProductService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(outputProductService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(outputProductService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody OutputProduct outputProduct) {
        outputProductService.save(outputProduct);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/outputProduct/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        outputProductService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/outputProduct/{id}")
    public ResponseEntity<?> edit(@PathVariable  OutputProduct outputProduct){
        outputProductService.edit(outputProduct);
        return ResponseEntity.ok(outputProduct);
    }

}
