package org.example.OOP.Seminar3.IteratorClassDog;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("Даша");
        name.add("Маша");
        name.add("Артем");
        name.add("Борис");
        name.add("Георгий");

        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

        List<Dog> listdog = new ArrayList<>(Arrays.asList(
                new Dog("пудель", 10), new Dog("терьер", 4),
                new Dog("хаски", 5), new Dog("борзая", 2),
                new Dog("такса", 3), new Dog("алабай", 1),
                new Dog("пудель", 2), new Dog("алабай", 2)));

        AgaDog agaDog = new AgaDog();
        System.out.println(listdog);
        Collections.sort(listdog); //  Comparable<Dog> переопределение метода внутри класса(разные версии см. класс Dog) (для базового сравнения)
        Collections.sort(listdog, agaDog); // Comparator переопределение внутри отдельного класса (для редких сравнений)
        System.out.println(listdog);
        System.out.println(listdog.iterator().next());
        System.out.println(listdog.iterator().hasNext());

        DogIterator DI = new DogIterator(listdog);
        while (DI.hasNext()){
            System.out.println(DI.next());
        }


    }

}
