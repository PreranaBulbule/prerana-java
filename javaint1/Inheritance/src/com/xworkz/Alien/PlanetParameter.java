package com.xworkz.Alien;

public class PlanetParameter {
    public void Mars(Planet planet){
        System.out.println("running planet in PlanetParameter");
        if(planet !=null){
            System.out.println("Distance is:"+planet.name);
            planet.distance();
        }
        else {
            System.out.println("is null enter something");
        }

    }
}
