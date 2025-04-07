package com.xworkz.Runner;
import com.xworkz.override20.Box;
import com.xworkz.override20.BoxStore;
import com.xworkz.override20.CardboardBox;

public class BoxRunner {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.getMaterial();
        box1.getSize();
        box1.getColor();
        box1.getWeight();
        box1.getPrice();

        System.out.println("-------------------");
        Box box2 = new CardboardBox();
        box2.getMaterial();
        box2.getSize();
        box2.getColor();
        box2.getWeight();
        box2.getPrice();

        System.out.println("-----------------");
        CardboardBox cardboardBox = new CardboardBox();
        cardboardBox.getMaterial();
        cardboardBox.getSize();
        cardboardBox.getColor();
        cardboardBox.getWeight();
        cardboardBox.getPrice();
        cardboardBox.getDurability();

        System.out.println("------------------");
        BoxStore boxStore = new BoxStore();
        boxStore.manage(box2);
        boxStore.manage(box1);
        boxStore.manage(cardboardBox);
    }
}
