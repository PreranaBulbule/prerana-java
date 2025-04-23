package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Cinema;
import com.xworkz.Interface.Internal.MovieCinemaPackagerImpl;

public class CinemaRunner {
    public static void main(String[] args) {
        MovieCinemaPackagerImpl packager = new MovieCinemaPackagerImpl();
        Cinema cinema = new Cinema(packager);
        cinema.startPackaging();
    }
}
