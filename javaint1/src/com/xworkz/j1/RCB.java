package com.xworkz.j1;

public class RCB {
    void match(Run run){
        System.out.println("this is RCB match");

        if(run != null)
        {
            System.out.println("This class has not null pointer exception");
            run.match();
        }
        else {
            System.out.println("This class has  null pointer exception");

        }
    }
}
