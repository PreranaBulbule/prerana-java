package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster moviePoster = new Poster("Action", "A3", 200.00);
        System.out.println(moviePoster);
        System.out.println("Custom hashCode (overridden): " + moviePoster.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(moviePoster));
    }
}

