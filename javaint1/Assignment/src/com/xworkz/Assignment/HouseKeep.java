package com.xworkz.Assignment;

public class HouseKeep {
    String name;
    String duty;

    public HouseKeep(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }
    public void display() {
        System.out.println("        House Keeper: " + name + " | Duty: " + duty);
    }
}

