package Software.Intern;

public class Football extends Ball {
    public Football() {
        super();
        System.out.println("No-args constructor of Football");

        super.bounce();
        System.out.println("Football is bouncing on the field");

        super.roll();
        System.out.println("Football is rolling towards the goal");

        super.throwBall();
        System.out.println("Throwing the football during a pass");

        super.catchBall();
        System.out.println("Catching the football with skill");
    }
}