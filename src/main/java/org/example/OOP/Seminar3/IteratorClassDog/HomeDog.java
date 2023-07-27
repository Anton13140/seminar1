package org.example.OOP.Seminar3.IteratorClassDog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeDog implements Iterable<Dog> {

    private List<Dog> listDog;

    public List<Dog> getListDog() {
        return listDog;
    }

    public HomeDog(List<Dog> listDog) {
        this.listDog = listDog;
    }

    public void setHomeDog(List<Dog> listDog) {
        this.listDog = listDog;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new DogIterator(listDog);
    }
}
