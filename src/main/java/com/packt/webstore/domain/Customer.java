package com.packt.webstore.domain;

import java.util.Objects;

public class Customer {
    private String customerId;
    private String name;
    private String adress;
    private int noOfOrdersMade;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNoOfOrdersMade(int noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return noOfOrdersMade == customer.noOfOrdersMade &&
                Objects.equals(customerId, customer.customerId) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(adress, customer.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, adress, noOfOrdersMade);
    }
}
