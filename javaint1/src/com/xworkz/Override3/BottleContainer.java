package com.xworkz.Override3;

public class BottleContainer {
    public void manage(Bottle bottle) {
        bottle.getMaterial();
        bottle.getCapacity();
        bottle.getColor();
        bottle.getShape();
        bottle.getPrice();

        if(bottle instanceof PlasticBottle) {
            System.out.println("Bottle is instance of PlasticBottle");
            PlasticBottle plasticBottle = (PlasticBottle) bottle;
            plasticBottle.recycle();
        }
    }
}

