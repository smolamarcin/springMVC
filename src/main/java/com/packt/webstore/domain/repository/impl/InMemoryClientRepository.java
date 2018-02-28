package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.ClientRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryClientRepository implements ClientRepository {
    private List<Customer> customers = new ArrayList<>();

    public InMemoryClientRepository() {
        Customer customer = new Customer("1", "Marcin");
        Customer customer2 = new Customer("2", "Malgosia");
        Customer customer3 = new Customer("3", "Ania");
        Customer customer4 = new Customer("4", "Jacek");
        customer4.setAdress("Jakis adres");
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
    }

    @Override
    public List<Customer> getAllClients() {
        return customers;
    }
}
