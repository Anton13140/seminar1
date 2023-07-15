package org.example.OOP.seminar1.HW;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachin {
//    public List<Product> products = new ArrayList<>();


    void initProduct(List<HotDrinks> hotDrinks);

    public  Product grtProduct(String name);

    HotDrinks grtProduct(String name, int t, int volume);
}
