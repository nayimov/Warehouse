package com.example.warehouse.service;

import com.example.warehouse.domain.Category;
import com.example.warehouse.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category getById(Long clientId) {
        return categoryRepository.getById(clientId);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public void edit(Category category) {
        categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
