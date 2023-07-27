package org.example.OOP.Seminar3.IteratorClassDog;

import java.util.Iterator;
import java.util.List;

public class DogIterator implements Iterator<Dog> {
    private List<Dog> dogListOfIterator;
    private int counter = 0;

    public DogIterator(List<Dog> dogList) {
        dogListOfIterator = dogList;

    }

    @Override
    public boolean hasNext() {

        return counter < dogListOfIterator.size() -1;
    }

    @Override
    public Dog next()
    {
        if(!hasNext()){
            return null;
        }
        counter++;
        return dogListOfIterator.get(counter);

    }
}
