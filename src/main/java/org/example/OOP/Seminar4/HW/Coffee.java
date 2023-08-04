package org.example.OOP.Seminar4.HW;

public class Coffee extends Product{

    private int temperature;

    public Coffee(String name, int prise, int temperature) {
        super(name, prise);
        this.temperature = temperature;
    }

}
