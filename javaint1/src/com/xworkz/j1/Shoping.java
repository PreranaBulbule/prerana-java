package com.xworkz.j1;

public class Shoping {
    void run(Display display){
        System.out.println("this is Shoping class");

        if(display !=null){
            System.out.println("this class has not null pointer exception");
            display.ads();
        }
        else {
            System.out.println("this class have null pointer exception");
        }
    }
}

