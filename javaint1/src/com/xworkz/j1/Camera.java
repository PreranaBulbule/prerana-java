package com.xworkz.j1;

public class Camera {
    void lens(Capture capture)
    {
        System.out.println("This is the class of Camera");

        if ( capture != null)
        {
            System.out.println("This class has not pointer exception ");
            capture.lens();
        }
        else {
            System.out.println("This class has pointer exception");
        }
    }
}
