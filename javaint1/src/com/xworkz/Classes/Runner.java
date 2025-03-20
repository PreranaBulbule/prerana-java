package com.xworkz.Classes;

public class Runner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("Blue");
        Clip clip2 = new Clip("Red");
        Clip clip3 = new Clip("Pink");
        Clip clip4 = new Clip("White");
        Clip clip5 = new Clip("Yellow");

        Clip[] clips = {clip1, clip2, clip3, clip4, clip5};
        Pushpa pushpa = new Pushpa(clips);
            pushpa.useClip(clips);
    }
}