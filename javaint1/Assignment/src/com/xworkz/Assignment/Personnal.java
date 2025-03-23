package com.xworkz.Assignment;

import java.util.Iterator;
import java.util.List;

public class Personnal {
    String name;
    List<Skill> skills;

    public void  Personnel(String name, List<Assignment.java.Skill> skills) {
        this.name = name;
        this.skill = skills;
    }

    public void display() {
        System.out.println("Personnel: " + this.name);
        Iterator var1 = this.skills.iterator();

        while (var1.hasNext()) {
            Skill skill = (Skill) var1.next();
            skill.display();
        }
    }
    }
