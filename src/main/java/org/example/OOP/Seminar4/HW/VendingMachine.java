package org.example.OOP.Seminar4.HW;

import java.util.List;

public class VendingMachine<T extends Product> {

    private List<T> productList;

    public void initProduct(List<T> product) {
        this.productList = product;
    }

    public Product<T> getProduct(String name) {
        for (T p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return new Product<T>("такого товара нет", 0);
    }
}
