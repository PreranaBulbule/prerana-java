package com.xworkz.Interface.Internal;

public class MovieCinemaPackagerImpl implements CinemaPackager {
    public MovieCinemaPackagerImpl() {
        System.out.println("No-arg constructor of MovieCinemaPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing cinema items using Movie Cinema Packager");
    }
}
