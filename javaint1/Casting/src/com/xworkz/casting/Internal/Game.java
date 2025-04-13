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
        return "Game{name=" + name + ", genre=" + genre + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("GameHashCode: " + super.hashCode());
        return 9832;  // Custom hash code value for Game
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Game) {
                System.out.println("have ref. will compare..");
                Game game1 = this;
                Game game2 = (Game) obj;
                if (game1.name.equals(game2.name) && game1.genre.equals(game2.genre) && game1.price == game2.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
