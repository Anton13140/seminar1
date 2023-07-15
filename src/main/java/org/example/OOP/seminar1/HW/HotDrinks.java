package org.example.OOP.seminar1.HW;

public class HotDrinks extends Product{
    private int t;
    private int volume;

    public HotDrinks(String name, int prise, int t, int volume) {
        super(name, prise);
        this.t = t;
        this.volume = volume;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "t=" + t +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }
}
