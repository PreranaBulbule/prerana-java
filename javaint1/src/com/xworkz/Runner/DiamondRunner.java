package com.xworkz.Runner;
import com.xworkz.override41.Diamond;
import com.xworkz.override41.GoldDiamond;
import com.xworkz.override41.DiamondStore;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond1 = new Diamond();
        diamond1.getMaterial();
        diamond1.getColor();
        diamond1.getSize();
        diamond1.getPrice();
        diamond1.getShape();

        System.out.println("-------------------");
        Diamond diamond2 = new GoldDiamond();
        diamond2.getMaterial();
        diamond2.getColor();
        diamond2.getSize();
        diamond2.getPrice();
        diamond2.getShape();

        System.out.println("-----------------");
        GoldDiamond goldDiamond = new GoldDiamond();
        goldDiamond.getMaterial();
        goldDiamond.getColor();
        goldDiamond.getSize();
        goldDiamond.getPrice();
        goldDiamond.getShape();
        goldDiamond.getGoldContent();

        System.out.println("------------------");
        DiamondStore diamondStore = new DiamondStore();
        diamondStore.manage(diamond2);
        diamondStore.manage(diamond1);
        diamondStore.manage(goldDiamond);
    }
}
