package com.xworkz.Runner;
import com.xworkz.override13.Nail;
import com.xworkz.override13.NailStore;
import com.xworkz.override13.SteelNail;

public class NailRunner {
    public static void main(String[] args) {
        Nail nail1 = new Nail();
        nail1.getMaterial();
        nail1.getSize();
        nail1.getColor();
        nail1.getPrice();
        nail1.getWeight();

        System.out.println("-------------------");
        Nail nail2 = new SteelNail();
        nail2.getMaterial();
        nail2.getSize();
        nail2.getColor();
        nail2.getPrice();
        nail2.getWeight();

        System.out.println("-----------------");
        SteelNail steelNail = new SteelNail();
        steelNail.getMaterial();
        steelNail.getSize();
        steelNail.getColor();
        steelNail.getPrice();
        steelNail.getWeight();
        steelNail.getDurability();

        System.out.println("------------------");
        NailStore nailStore = new NailStore();
        nailStore.manage(nail2);
        nailStore.manage(nail1);
        nailStore.manage(steelNail);
    }
}
