package com.xworkz.Runner;
import com.xworkz.Override3.Bottle;
import com.xworkz.Override3.BottleContainer;
import com.xworkz.Override3.PlasticBottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.getMaterial();
        bottle1.getCapacity();
        bottle1.getColor();
        bottle1.getShape();
        bottle1.getPrice();

        System.out.println("-------------------");
        Bottle bottle2 = new PlasticBottle();
        bottle2.getMaterial();
        bottle2.getCapacity();
        bottle2.getColor();
        bottle2.getShape();
        bottle2.getPrice();

        System.out.println("-----------------");
        PlasticBottle plasticBottle = new PlasticBottle();
        plasticBottle.getMaterial();
        plasticBottle.getCapacity();
        plasticBottle.getColor();
        plasticBottle.getShape();
        plasticBottle.getPrice();
        plasticBottle.recycle();

        System.out.println("------------------");
        BottleContainer bottleContainer = new BottleContainer();
        bottleContainer.manage(bottle2);
        bottleContainer.manage(bottle1);
        bottleContainer.manage(plasticBottle);
    }
}