package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private ProductRepository productRepository;

    @Autowired
    public OrderServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Zbyt malo towaru! Obecna liczba sztuk w magazynie: " +
                    productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
