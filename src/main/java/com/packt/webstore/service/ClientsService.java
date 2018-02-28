package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;

import java.util.List;

public interface ClientsService {
    List<Customer> getAllCustomers();
}
