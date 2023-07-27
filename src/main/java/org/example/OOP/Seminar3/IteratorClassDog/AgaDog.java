package org.example.OOP.Seminar3.IteratorClassDog;

import java.util.Comparator;

public class AgaDog implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        int result = o1.getName().compareTo(o2.getName());
        if(result == 0){
            result = o1.getAge().compareTo(o2.getAge());
        }
        return result;
    }
}
