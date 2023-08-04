package org.example.OOP.Seminar4.HW;

import org.example.OOP.seminar1.AbstractProduct.Woter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VendingMachine <Product> vendingMachine = new VendingMachine<>();

        List <Product> productList = new ArrayList<>(Arrays.asList(
                new SweetWater("кола", 23, true),
                new SweetWater("пепси", 23, true),
                new SweetWater("миниралка", 19, false),
                new Coffee("нескафе", 35, 60),
                new Coffee("джакобс", 40, 80)));

        vendingMachine.initProduct(productList);

        System.out.println(vendingMachine.getProduct("кола"));
        System.out.println(vendingMachine.getProduct("не кола"));
        System.out.println(vendingMachine.getProduct("нескафе"));

    }

}
