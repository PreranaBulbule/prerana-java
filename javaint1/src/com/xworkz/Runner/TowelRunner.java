package com.xworkz.Runner;

import com.xworkz.override12.Towel;
import com.xworkz.override12.TowelStore;
import com.xworkz.override12.BeachTowel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel1 = new Towel();
        towel1.getMaterial();
        towel1.getSize();
        towel1.getColor();
        towel1.getPrice();
        towel1.getWeight();

        System.out.println("-------------------");
        Towel towel2 = new BeachTowel();
        towel2.getMaterial();
        towel2.getSize();
        towel2.getColor();
        towel2.getPrice();
        towel2.getWeight();

        System.out.println("-----------------");
        BeachTowel beachTowel = new BeachTowel();
        beachTowel.getMaterial();
        beachTowel.getSize();
        beachTowel.getColor();
        beachTowel.getPrice();
        beachTowel.getWeight();
        beachTowel.getDesign();

        System.out.println("------------------");
        TowelStore towelStore = new TowelStore();
        towelStore.manage(towel2);
        towelStore.manage(towel1);
        towelStore.manage(beachTowel);
    }
}