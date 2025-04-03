package Software.Intern;

public class Apple extends Fruits {
    public Apple() {
        super();
        System.out.println("No-args constructor of Apple");

        super.eatFruit();
        System.out.println("Eating a fresh apple");

        super.washFruit();
        System.out.println("Washing an apple before eating");

        super.storeFruit();
        System.out.println("Keeping the apple in a fruit basket");

        super.cutFruit();
        System.out.println("Slicing the apple into pieces");
    }
}
