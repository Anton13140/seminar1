package org.example.OOP.seminar1.HW;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachin {

    List<HotDrinks> hotDrinks = new ArrayList<>();

    @Override
    public void initProduct(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public HotDrinks grtProduct(String name) {
        for (HotDrinks hd:hotDrinks) {
            if(hd.getName().equals(name)) return hd;
        }
        return new HotDrinks("такого напитка нет", 0, 0, 0);
    }
    @Override
    public HotDrinks grtProduct(String name, int t, int volume) {
        for (HotDrinks hd:hotDrinks) {
            if(hd.getName().equals(name) && hd.getT() == t && hd.getVolume() == volume) return hd;
        }
        return new HotDrinks("такого напитка нет", 0, 0, 0);
    }


}
