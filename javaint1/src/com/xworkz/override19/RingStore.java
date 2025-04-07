package com.xworkz.override19;

public class RingStore {
    public void manage(Ring ring) {
        ring.getMaterial();
        ring.getSize();
        ring.getPrice();
        ring.getColor();
        ring.getBrand();

        if (ring instanceof GoldRing) {
            System.out.println("Ring is instance of GoldRing");
            GoldRing goldRing = (GoldRing) ring;
            goldRing.getCarat();
        }
    }
}

