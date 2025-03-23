package com.xworkz.Assignment;

import java.util.List;

public class State {
    String name;
    List<District> districts;

    public State(String name, List<District> districts) {
        this.name = name;
        this.districts = districts;
    }

    public void display() {
        System.out.println("    State: " + name);
        for (District district : districts) {
            district.display();
        }
    }
}
