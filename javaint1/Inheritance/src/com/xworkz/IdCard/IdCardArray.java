package com.xworkz.IdCard;

public class IdCardArray {
    public void showCards() {
        IdCard id1 = new IdCard();
        id1.setMaterial("Plastic");
        id1.setColors(new String[]{"Red", "Blue"});
        id1.setWeight(10.5);
        id1.setDesignedBy("ABC Designs");

        IdCard id2 = new IdCard();
        id2.setMaterial("Paper");
        id2.setColors(new String[]{"Green", "White"});
        id2.setWeight(5.0);
        id2.setDesignedBy("XYZ Corp");

        id1.displayDetails();
        id2.displayDetails();
    }
}
