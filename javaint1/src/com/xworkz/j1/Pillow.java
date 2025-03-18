package com.xworkz.j1;

public class Pillow {
    void smooth(Sleep sleep)
    {
        System.out.println("This is the class of Pillow");

        if (sleep != null)
        {
            System.out.println("This class has not pointer exception");
            sleep.smooth();
        }
        else {
            System.out.println("This class has the pointer Exception");
        }
    }
}
