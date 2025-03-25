package com.xworkz;

import com.xworkz.clasvarpar.alien.Alien;
import com.xworkz.clasvarpar.alien.AlienArray;
import com.xworkz.clasvarpar.alien.Planet;
import com.xworkz.clasvarpar.alien.PlanetParameter;

public class Runner {
    public static void main(String[] args) {
        // Alien Object
        Alien alien = new Alien();
        alien.setSeenby("Arunoday");
        alien.setSeenDate("25/03/25");
        alien.setDescribe("It has three eyes, is small, and has some extraordinary powers.");

        System.out.println("Alien Details:");
        System.out.println("Seen by: " + alien.getSeenby());
        System.out.println("Seen date: " + alien.getSeenDate());
        System.out.println("Description: " + alien.getDescribe());

        System.out.println(" ");
        System.out.println("Array of alien ");
        AlienArray alienArray=new AlienArray();
        alienArray.Array();

        Planet planet=new Planet();
        planet.name="Sun";
        PlanetParameter planetParameter=new PlanetParameter();
        planetParameter.Mars(planet);

        PlanetParameter planetParameter1=new PlanetParameter();
        planetParameter1.Mars(planet);
        System.out.println("-------------------------------------------------------------");
    }
}
