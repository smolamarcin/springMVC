package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

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
        bulbulator.setDescription("opis lapka");
        bulbulator.setCategory("komputery");
        bulbulator.setManufacturer("dell");
        bulbulator.setUnitsInStock(900);

        Product buty = new Product("P1236", "buty XD", new BigDecimal(100));
        buty.setDescription("XD");
        buty.setCategory("obuwie");
        buty.setManufacturer("nike");
        buty.setUnitsInStock(20);

        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(bulbulator);
        listOfProducts.add(buty);
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

    @Override
    public List<Product> getProductsByCategory(String category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : listOfProducts) {
            if (product.getCategory().equals(category)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    @Override
    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        Set<Product> productsByBrand = new HashSet<>();
        Set<Product> productsByCategory = new HashSet<>();
        Set<String> criterias = filterParams.keySet();
        if (criterias.contains("brand")) {
            for (String brandName : filterParams.get("brand")) {
                for (Product product : listOfProducts) {
                    if (brandName.equalsIgnoreCase(product.getManufacturer())) {
                        productsByBrand.add(product);
                    }
                }
            }
        }
        if (criterias.contains("category")) {
            for (String category : filterParams.get("category")) {
                productsByCategory.addAll(this.getProductsByCategory(category));
            }
        }
        productsByCategory.retainAll(productsByBrand);
        return productsByCategory;
    }

    @Override
    public List<Product> getProductsByCategoryAndPrice(String category, String price) {
        List<Product> productsByCategoryAndPrice = getProductsByCategory(category);
        productsByCategoryAndPrice.addAll(getProductsByPrice(price));
        return productsByCategoryAndPrice;
    }

    @Override
    public List<Product> getProductsByPrice(String price) {
        List<Product> productsByPrice = new ArrayList<>();
        for (Product product : listOfProducts) {
            if (product.getUnitPrice().equals(new BigDecimal(price))) {
                productsByPrice.add(product);
            }
        }
        return productsByPrice;
    }
}
