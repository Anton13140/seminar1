package org.example.OOP.seminar1.HW;

public class Product {

    protected String name;
    protected int prise;

    public Product() {
    }

    public Product(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
