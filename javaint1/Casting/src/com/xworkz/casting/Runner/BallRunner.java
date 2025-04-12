package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Ball;

public class BallRunner {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        System.out.println(new Ball().hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(b));

        Ball ball1 = new Ball();
        ball1.setType("Football");

        Ball ball2 = new Ball();
        ball2.setType("Basketball");

        boolean same = ball1.equals(ball2);
        System.out.println("Both same type: " + same);
    }
}


