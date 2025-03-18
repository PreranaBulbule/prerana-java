package com.xworkz.j1;

public class Launch {
    public static void main(String[] args)
    {
        Rocket rocket = new Rocket();
        Fly fly = new Fly();
        rocket.drone(fly);
        System.out.println("  ");
    }
}
