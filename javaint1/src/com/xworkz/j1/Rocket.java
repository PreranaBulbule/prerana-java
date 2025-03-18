package com.xworkz.j1;

public class Rocket {
    void drone (Fly fly){
        System.out.println("This is the class of Rocket");

        if( fly != null)
        {
           System.out.println("This class has not pointer exception");
           fly.drone();
        }
        else {
            System.out.println("This class has pointer exception");
        }
    }
}
