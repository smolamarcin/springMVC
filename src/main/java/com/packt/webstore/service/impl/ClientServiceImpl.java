package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.ClientRepository;
import com.packt.webstore.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientsService {
    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return clientRepository.getAllClients();
    }
}
