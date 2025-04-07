package com.xworkz.Runner;
import com.xworkz.override19.Ring;
import com.xworkz.override19.RingStore;
import com.xworkz.override19.GoldRing;

public class RingRunner {
    public static void main(String[] args) {
        Ring ring1 = new Ring();
        ring1.getMaterial();
        ring1.getSize();
        ring1.getPrice();
        ring1.getColor();
        ring1.getBrand();

        System.out.println("-------------------");
        Ring ring2 = new GoldRing();
        ring2.getMaterial();
        ring2.getSize();
        ring2.getPrice();
        ring2.getColor();
        ring2.getBrand();

        System.out.println("-----------------");
        GoldRing goldRing = new GoldRing();
        goldRing.getMaterial();
        goldRing.getSize();
        goldRing.getPrice();
        goldRing.getColor();
        goldRing.getBrand();
        goldRing.getCarat();

        System.out.println("------------------");
        RingStore ringStore = new RingStore();
        ringStore.manage(ring2);
        ringStore.manage(ring1);
        ringStore.manage(goldRing);
    }
}
