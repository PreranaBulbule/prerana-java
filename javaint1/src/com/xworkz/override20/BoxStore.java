package com.xworkz.override20;

public class BoxStore {
    public void manage(Box box) {
        box.getMaterial();
        box.getSize();
        box.getColor();
        box.getWeight();
        box.getPrice();

        if (box instanceof CardboardBox) {
            System.out.println("Box is instance of CardboardBox");
            CardboardBox cardboardBox = (CardboardBox) box;
            cardboardBox.getDurability();
        }
    }
}

