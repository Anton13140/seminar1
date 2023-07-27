package org.example.OOP.Seminar3.IteratorClassDog;

import java.util.Comparator;
import java.util.Iterator;

public class Dog implements Comparable<Dog> {


    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String  toString() {
//        return String.format("")
//    }

    @Override
    public String toString() {
        return String.format("Собака {Имя: %s, Возраст: %d лет}", name, age);
    }


//    @Override
//    public int compareTo(Dog o) {
//        int result = this.name.compareTo(o.name);
//        if(result == 0){
//            result = this.age.compareTo(o.age);
//        }
//        return result;
//    }


    @Override
    public int compareTo(Dog o) {
        return this.name.compareTo(o.name);
    }


}
