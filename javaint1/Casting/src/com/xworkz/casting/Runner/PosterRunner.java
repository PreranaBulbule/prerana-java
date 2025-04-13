package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster moviePoster = new Poster("Action", "A3", 200.00);
        System.out.println(moviePoster);
        System.out.println("Custom hashCode (overridden): " + moviePoster.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(moviePoster));

        Poster poster1 = new Poster("Action", "A3", 200.00);
        Poster poster2 = new Poster("Action", "A3", 200.00);
        boolean areSame = poster1.equals(poster2);
        System.out.println("Are both posters the same? " + areSame);

        Poster poster3 = new Poster("Comedy", "A4", 150.00);
        boolean areDifferent = poster1.equals(poster3);
        System.out.println("Are both posters the same? " + areDifferent);
    }
}
