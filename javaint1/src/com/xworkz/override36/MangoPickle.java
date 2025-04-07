package com.xworkz.override36;

public class MangoPickle extends Pickle {
    public MangoPickle() {
        super();
        System.out.println("Running non-arg constructor MangoPickle--child");
    }

    @Override
    public void getType() {
        System.out.println("Mango pickle type: Spicy or Sweet--child");
    }

    @Override
    public void getFlavor() {
        System.out.println("Mango pickle flavor: Tangy and spicy--child");
    }

    @Override
    public void getSpiciness() {
        System.out.println("Mango pickle spiciness level: High--child");
    }

    @Override
    public void getShelfLife() {
        System.out.println("Mango pickle shelf life: 1-2 years--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Mango pickle price: $3 to $5 per jar--child");
    }

    public void getRegion() {
        System.out.println("Mango pickle region: Popular in India--child only method");
    }
}