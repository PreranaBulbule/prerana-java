package com.xworkz.Alien;

public class AlienArray {
    public void Array(){
        Alien alien1=new Alien();
        alien1.setSeenby("Nisarga");
        alien1.setSeenDate("25/2/2023");
        alien1.setDescribe("small and fragile");

        Alien alien2=new Alien();
        alien2.setSeenby("Bhumi");
        alien2.setSeenDate("5/6/2024");
        alien2.setDescribe("horrible");

        System.out.println("Alien 1 Details:");
        System.out.println("Seen by: " + alien1.getSeenby());
        System.out.println("Seen date: " + alien1.getSeenDate());
        System.out.println("Description: " + alien1.getDescribe());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("Alien 2 Details:");
        System.out.println("Seen by: " + alien2.getSeenby());
        System.out.println("Seen date: " + alien2.getSeenDate());
        System.out.println("Description: " + alien2.getDescribe());

    }
}
