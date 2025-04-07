package com.xworkz.Runner;
import com.xworkz.override42.Gold;
import com.xworkz.override42.TwentyFourKGold;
import com.xworkz.override42.GoldStore;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold1 = new Gold();
        gold1.getMaterial();
        gold1.getColor();
        gold1.getPurity();
        gold1.getPrice();
        gold1.getWeight();

        System.out.println("-------------------");
        Gold gold2 = new TwentyFourKGold();
        gold2.getMaterial();
        gold2.getColor();
        gold2.getPurity();
        gold2.getPrice();
        gold2.getWeight();

        System.out.println("-----------------");
        TwentyFourKGold twentyFourKGold = new TwentyFourKGold();
        twentyFourKGold.getMaterial();
        twentyFourKGold.getColor();
        twentyFourKGold.getPurity();
        twentyFourKGold.getPrice();
        twentyFourKGold.getWeight();
        twentyFourKGold.getGoldUsage();

        System.out.println("------------------");
        GoldStore goldStore = new GoldStore();
        goldStore.manage(gold2);
        goldStore.manage(gold1);
        goldStore.manage(twentyFourKGold);
    }
}
