package com.example.warehouse.service;

import com.example.warehouse.domain.InputProduct;
import com.example.warehouse.repository.InputProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputProductService {

    private InputProductRepository inputProductRepository;

    public InputProductService(InputProductRepository inputProductRepository) {
        this.inputProductRepository = inputProductRepository;
    }

    public void save(InputProduct inputProduct) {
        inputProductRepository.save(inputProduct);
    }

    public InputProduct getById(Long id) {
        return inputProductRepository.getById(id);
    }

    public List<InputProduct> getAll() {
        return inputProductRepository.findAll();
    }

    public void edit(InputProduct inputProduct) {
        inputProductRepository.save(inputProduct);
    }

    public void delete(Long id) {
        inputProductRepository.deleteById(id);
    }

}
