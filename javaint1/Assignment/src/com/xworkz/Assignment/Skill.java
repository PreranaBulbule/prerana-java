package com.xworkz.Assignment;

public class Skill {
    String name;
    Experience experience;

    public Skill(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public void display() {
        System.out.println("          Skill: " + this.name);
        this.experience.display();
    }
}

