package com.xworkz.casting.Internal;

public class Game {
    private String name;
    private String genre;
    private double price;

    public Game(String name, String genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game [name=" + name + ", genre=" + genre + ", price=" + price + "]";
    }
}
