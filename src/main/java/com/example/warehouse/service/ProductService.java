package com.example.warehouse.service;

import com.example.warehouse.domain.Product;
import com.example.warehouse.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void save(Product product) {
        productRepository.save(product);
    }

    public Product getById(Long id) {
        return (Product) productRepository.getById(id);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void edit(Product product) {
        productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
