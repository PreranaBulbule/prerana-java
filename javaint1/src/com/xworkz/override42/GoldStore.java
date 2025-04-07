package com.xworkz.override42;

public class GoldStore {
    public void manage(Gold gold) {
        gold.getMaterial();
        gold.getColor();
        gold.getPurity();
        gold.getPrice();
        gold.getWeight();

        if (gold instanceof TwentyFourKGold) {
            System.out.println("Gold is instance of TwentyFourKGold");
            TwentyFourKGold twentyFourKGold = (TwentyFourKGold) gold;
            twentyFourKGold.getGoldUsage();
        }
    }

}
