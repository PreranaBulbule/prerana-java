package com.xworkz.Assignment;

import java.util.List;

public class PrimeMinister {
    String name;
    int age;
    String term;
    List<Minister> ministers;

    public PrimeMinister(String name, int age, String term, List<Minister> ministers) {
        this.name = name;
        this.age = age;
        this.term = term;
        this.ministers = ministers;
    }

    public void display() {
        System.out.println("  Prime Minister: " + name + " | Age: " + age + " | Term: " + term);
        for (Minister minister : ministers) {
            minister.display();
        }
    }
}

