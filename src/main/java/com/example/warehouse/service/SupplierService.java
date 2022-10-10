package com.example.warehouse.service;

import com.example.warehouse.domain.Supplier;
import com.example.warehouse.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

private SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public void save(Supplier supplier){
        supplierRepository.save(supplier);
    }
    public Supplier getById(Long id){
        return (Supplier) supplierRepository.getById(id);
    }

    public List<Supplier> getAll(){
        return supplierRepository.findAll();
    }
    public void edit(Supplier supplier){
        supplierRepository.save(supplier);
    }
    public void delete(Long id){
        supplierRepository.deleteById(id);
    }
}
