package com.xworkz.j1;

public class Barber {
    void cut(Hair hair){
        System.out.println("This is the class of Recovery");

        if( hair != null)
        {
            System.out.println("This class has not pointer exception");
            hair.cut();
        }
        else {
            System.out.println("This class has pointer exception");
        }
    }
}
