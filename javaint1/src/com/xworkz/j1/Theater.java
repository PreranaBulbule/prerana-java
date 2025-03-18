package com.xworkz.j1;

public class Theater {
    void show(Poster poster){
        System.out.println("this is poster class");

        if(poster !=null){
            System.out.println("this class has not null pointer exception");
            poster.show();
        }
        else {
            System.out.println("this class have null pointer exception");
        }
    }
}

