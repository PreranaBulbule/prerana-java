package com.xworkz.j1;

public class Space {
    void air (Got got){
        System.out.println("This is Space class");

        if ( got != null)
        {
            System.out.println("This class has not pointer exception");
            got.air();
        }
        else {
            System.out.println("this class has an pointer exception");
        }
    }
}
