package com.xworkz.Alien;

public class AParaArray {
    private com.xworkz.clasvarpar.alien.Planet[] Planet;

    public AParaArray(){
        System.out.println("running AParaArray in ");
    }
    public void travel(Planet[] planet){
        System.out.println("runnng Alien planet array");
        if (planet !=null){
            for (Planet pl:Planet){
                System.out.println(pl.name);
                pl.distance();
            }

        }
    }
}
