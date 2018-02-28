package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private List<Product> listOfProducts = new ArrayList<>();

    public InMemoryProductRepository() {
        Product iphone = new Product("P1234", "Iphone", new BigDecimal(1000));
        iphone.setDescription("opis ajfona");
        iphone.setCategory("telefony");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);

        Product laptop_dell = new Product("P1235", "dell inspiron", new BigDecimal(1200));
        laptop_dell.setDescription("opis lapka");
        laptop_dell.setCategory("komputery");
        laptop_dell.setManufacturer("dell");
        laptop_dell.setUnitsInStock(900);

        Product bulbulator = new Product("P1235", "bulbulator", new BigDecimal(1200));
        laptop_dell.setDescription("opis lapka");
        laptop_dell.setCategory("komputery");
        laptop_dell.setManufacturer("dell");
        laptop_dell.setUnitsInStock(900);

        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(bulbulator);
    }

    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    @Override
    public Product getProductById(String productId) {
        Product productByid = null;
        for (Product product : listOfProducts) {
            if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
                productByid = product;
                break;
            }
        }
        if (productByid == null) {
            throw new IllegalArgumentException("Brak produktu o wskazanym ID: " + productId);
        }
        return productByid;
    }
}
