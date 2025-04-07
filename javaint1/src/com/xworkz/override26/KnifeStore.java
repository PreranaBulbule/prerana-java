package com.xworkz.override26;

public class KnifeStore {
    public void manage(Knife knife) {
        knife.getBrand();
        knife.getType();
        knife.getSize();
        knife.getMaterial();
        knife.getPrice();

        if (knife instanceof ChefKnife) {
            System.out.println("Knife is instance of ChefKnife");
            ChefKnife chefKnife = (ChefKnife) knife;
            chefKnife.getSharpness();
        }
    }

}
