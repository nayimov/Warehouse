package com.example.warehouse.service;

import com.example.warehouse.domain.Currency;
import com.example.warehouse.repository.ClientRepository;
import com.example.warehouse.repository.CurrenyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrenyService {
  private  CurrenyRepository currenyRepository;

    public CurrenyService(CurrenyRepository currenyRepository) {
        this.currenyRepository = currenyRepository;
    }

    public void save(Currency currency){
        currenyRepository.save(currency);
    }

    public Currency getById(Long id){
        return currenyRepository.getById(id);
    }

    public List<Currency> getAll(){
        return currenyRepository.findAll();
    }
    public void edit(Currency currency){
        currenyRepository.save(currency);
    }

    public void delete(Long id){
        currenyRepository.deleteById(id);

    }
}
