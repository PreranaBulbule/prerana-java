package com.xworkz.j1;

public class Mango {
    void taste(Flavour flavour){
        System.out.println("This is the class of mango");

        if(flavour != null)
        {
            System.out.println("This class has not pointer exception");
            flavour.taste();
        }
        else{
            System.out.println("This class has the pointer exception");
        }
    }
}
