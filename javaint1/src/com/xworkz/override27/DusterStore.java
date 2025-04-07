package com.xworkz.override27;

public class DusterStore {
    public void manage(Duster duster) {
        duster.getBrand();
        duster.getMaterial();
        duster.getSize();
        duster.getColor();
        duster.getPrice();

        if (duster instanceof MicrofiberDuster) {
            System.out.println("Duster is instance of MicrofiberDuster");
            MicrofiberDuster microfiberDuster = (MicrofiberDuster) duster;
            microfiberDuster.getWashability();
        }
    }

}
