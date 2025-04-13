package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game actionGame = new Game("Assassin's Creed", "Action-Adventure", 59.99);
        System.out.println(actionGame);
        System.out.println("Custom hashCode (overridden): " + actionGame.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(actionGame));

        Game game1 = new Game("Assassin's Creed", "Action-Adventure", 59.99);
        Game game2 = new Game("Assassin's Creed", "Action-Adventure", 59.99);
        boolean same = game1.equals(game2);
        System.out.println("Both games are same: " + same);

        Game game3 = new Game("FIFA 22", "Sports", 49.99);
        Game game4 = new Game("Assassin's Creed", "Action-Adventure", 59.99);
        boolean different = game3.equals(game4);
        System.out.println("Both games are same: " + different);
    }
}


