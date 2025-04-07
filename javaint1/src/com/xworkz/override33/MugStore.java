package com.xworkz.override33;

public class MugStore {
    public void manage(Mug mug) {
        mug.getBrand();
        mug.getColor();
        mug.getSize();
        mug.getMaterial();
        mug.getPrice();

        if (mug instanceof CoffeeMug) {
            System.out.println("Mug is instance of CoffeeMug");
            CoffeeMug coffeeMug = (CoffeeMug) mug;
            coffeeMug.getHandleType();
        }
    }

}
