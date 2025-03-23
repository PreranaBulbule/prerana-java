package com.xworkz.Assignment;

public class Room {
    String name;
    int size;

    public Room(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void display() {
        System.out.println("        Room: " + name + " | Size: " + size + " sq.ft");
    }
}

