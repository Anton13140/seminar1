package org.example.OOP.seminar1.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//       2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//        перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//        соответствующий имени, объему и температуре
//       3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести
//        логику заложенную в программе
//       4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

        VendingMachin hdm = new HotDrinksMachine();

        List<HotDrinks> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrinks("кофе", 15, 90, 30),
                new HotDrinks("чай", 13, 90, 30),
                new HotDrinks("какао", 20, 90, 30),
                new HotDrinks("суп", 16, 60, 50),
                new HotDrinks("кисель", 10, 30, 40)));

        hdm.initProduct(hotDrinks);

        System.out.println(hdm.grtProduct("кофе", 90, 30));

    }
}
