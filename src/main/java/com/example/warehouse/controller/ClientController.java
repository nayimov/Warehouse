package com.example.warehouse.controller;

import com.example.warehouse.domain.Category;
import com.example.warehouse.domain.Client;
import com.example.warehouse.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(clientService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(clientService.getClientById(id));
    }

    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return ResponseEntity.status(200).body(null);
    }
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        clientService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/clients/{id}")
    public ResponseEntity<?> edit(@PathVariable Client client){
        clientService.edit(client);
        return ResponseEntity.ok(client);
    }

}
