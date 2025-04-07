package com.xworkz.Runner;
import com.xworkz.override28.Bangle;
import com.xworkz.override28.BangleStore;
import com.xworkz.override28.GoldBangle;

public class BangleRunner {
    public static void main(String[] args) {
        Bangle bangle1 = new Bangle();
        bangle1.getBrand();
        bangle1.getMaterial();
        bangle1.getSize();
        bangle1.getColor();
        bangle1.getPrice();

        System.out.println("-------------------");
        Bangle bangle2 = new GoldBangle();
        bangle2.getBrand();
        bangle2.getMaterial();
        bangle2.getSize();
        bangle2.getColor();
        bangle2.getPrice();

        System.out.println("-----------------");
        GoldBangle goldBangle = new GoldBangle();
        goldBangle.getBrand();
        goldBangle.getMaterial();
        goldBangle.getSize();
        goldBangle.getColor();
        goldBangle.getPrice();
        goldBangle.getPurity();

        System.out.println("------------------");
        BangleStore bangleStore = new BangleStore();
        bangleStore.manage(bangle2);
        bangleStore.manage(bangle1);
        bangleStore.manage(goldBangle);
    }
}
