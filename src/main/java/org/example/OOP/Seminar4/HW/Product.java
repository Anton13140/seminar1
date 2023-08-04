package org.example.OOP.Seminar4.HW;

public class Product<T> {
    protected String name;
    protected int prise;

    public Product(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return String.format("Продукт [Название: %s, цена: %d]", name, prise);
    }
}
