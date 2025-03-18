package com.xworkz.j1;

public class Photo {
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        Capture capture = new Capture();
        camera.lens(capture);
        System.out.println(" ");

    }
}
