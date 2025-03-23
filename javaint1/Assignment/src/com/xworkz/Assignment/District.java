package com.xworkz.Assignment;

public class District {
    String name;
    List<Ward> wards;

    public District(String name, List<Ward> wards) {
        this.name = name;
        this.wards = wards;
    }

    public void display() {
        System.out.println("      District: " + name);
        for (Ward ward : wards) {
            ward.display();
        }
    }
}

