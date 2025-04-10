package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game actionGame = new Game("Assassin's Creed", "Action-Adventure", 59.99);
        System.out.println(actionGame);
        System.out.println("Custom hashCode (overridden): " + actionGame.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(actionGame));
    }
}

