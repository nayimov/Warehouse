package com.example.warehouse.service;

import com.example.warehouse.domain.Input;
import com.example.warehouse.repository.InputRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputService {
 private InputRespository inputRespository;


    public InputService(InputRespository inputRespository) {
        this.inputRespository = inputRespository;
    }

    public void  save(Input input){
        inputRespository.save(input);
    }

    public Input getById(Long id){
        return inputRespository.getById(id);
    }
    public List<Input> getAll(){
        return inputRespository.findAll();
    }

    public void edit(Input input){
        inputRespository.save(input);
    }
    public void delete(Long id){
        inputRespository.deleteById(id);
    }
}
