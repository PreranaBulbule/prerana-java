package com.xworkz.override35;

public class FacePowder extends Powder {
    public FacePowder() {
        super();
        System.out.println("Running non-arg constructor FacePowder--child");
    }

    @Override
    public void getType() {
        System.out.println("Face powder type: Loose or compact--child");
    }

    @Override
    public void getColor() {
        System.out.println("Face powder color: Beige, White, or Pink--child");
    }

    @Override
    public void getWeight() {
        System.out.println("Face powder weight: Typically 50g to 150g--child");
    }

    @Override
    public void getUsage() {
        System.out.println("Face powder is used for makeup and oil control--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Face powder price: $5 to $20 per pack--child");
    }

    public void getBrand() {
        System.out.println("Face powder brand: Maybelline, L'Oreal, etc.--child only method");
    }
}