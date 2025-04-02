package Software.Intern;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("No-args constructor of Dog");

        super.eat();
        System.out.println("Dog is eating");

        super.sleep();
        System.out.println("Dog is sleeping");

        super.makeSound();
        System.out.println("Dog is barking");

        super.move();
        System.out.println("Dog is running");
    }
}

