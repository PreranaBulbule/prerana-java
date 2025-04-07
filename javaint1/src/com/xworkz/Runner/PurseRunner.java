package com.xworkz.Runner;
import com.xworkz.override46.Purse;
import com.xworkz.override46.LeatherPurse;
import com.xworkz.override46.PurseStore;

public class PurseRunner {
    public static void main(String[] args) {
        Purse purse1 = new Purse();
        purse1.getMaterial();
        purse1.getColor();
        purse1.getSize();
        purse1.getDesign();
        purse1.getClosureType();

        System.out.println("-------------------");
        Purse purse2 = new LeatherPurse();
        purse2.getMaterial();
        purse2.getColor();
        purse2.getSize();
        purse2.getDesign();
        purse2.getClosureType();

        System.out.println("-----------------");
        LeatherPurse leatherPurse = new LeatherPurse();
        leatherPurse.getMaterial();
        leatherPurse.getColor();
        leatherPurse.getSize();
        leatherPurse.getDesign();
        leatherPurse.getClosureType();
        leatherPurse.getDurability();

        System.out.println("------------------");
        PurseStore purseStore = new PurseStore();
        purseStore.manage(purse2);
        purseStore.manage(purse1);
        purseStore.manage(leatherPurse);
    }
}
