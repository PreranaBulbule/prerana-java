package com.xworkz.override41;

public class DiamondStore {
    public void manage(Diamond diamond) {
        diamond.getMaterial();
        diamond.getColor();
        diamond.getSize();
        diamond.getPrice();
        diamond.getShape();

        if (diamond instanceof GoldDiamond) {
            System.out.println("Diamond is instance of GoldDiamond");
            GoldDiamond goldDiamond = (GoldDiamond) diamond;
            goldDiamond.getGoldContent();
        }
    }

}
