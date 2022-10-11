package com.example.warehouse.service;

import com.example.warehouse.domain.Client;
import com.example.warehouse.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Client getClientById(Long clientId) {
        return clientRepository.getById(clientId);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void edit(Client client) {
        clientRepository.save(client);
    }

    public void delete(Long clientId) {
        clientRepository.deleteById(clientId);
    }


}