package com.example.warehouse.controller;

import com.example.warehouse.domain.Currency;
import com.example.warehouse.service.CurrenyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/curreny")
public class CurrenyController {

    private CurrenyService currenyService;

    public CurrenyController(CurrenyService currenyService) {
        this.currenyService = currenyService;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(currenyService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(currenyService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Currency currency) {
        currenyService.save(currency);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/curreny/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        currenyService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/curreny/{id}")
    public ResponseEntity<?> edit(@PathVariable Currency curreny) {
        currenyService.edit(curreny);
        return ResponseEntity.ok(curreny);
    }

}
