package com.example.warehouse.controller;

import com.example.warehouse.domain.Attachment;
import com.example.warehouse.domain.AttachmentContent;
import com.example.warehouse.service.AttachmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Attachment")
public class AttachmentController {


    private AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(attachmentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(attachmentService.getById(id));
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Attachment attachment) {
        attachmentService.save(attachment);
        return ResponseEntity.status(200).body(null);
    }
    @DeleteMapping("/Attachment/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        attachmentService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/Attachment/{id}")
    public ResponseEntity<?> edit(@PathVariable Attachment attachment){
        attachmentService.edit(attachment);
        return ResponseEntity.ok(attachment);
    }
    }

