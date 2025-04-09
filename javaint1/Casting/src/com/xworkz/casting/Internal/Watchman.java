package com.xworkz.casting.Internal;

public class Watchman {
    private String name;
    private String shift;
    private double salary;

    public Watchman(String name, String shift, double salary) {
        this.name = name;
        this.shift = shift;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Watchman [name=" + name + ", shift=" + shift + ", salary=" + salary + "]";
    }
}
