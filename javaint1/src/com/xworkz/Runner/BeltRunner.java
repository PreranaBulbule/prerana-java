package com.xworkz.Runner;
import com.xworkz.override45.Belt;
import com.xworkz.override45.LeatherBelt;
import com.xworkz.override45.BeltStore;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt1 = new Belt();
        belt1.getMaterial();
        belt1.getColor();
        belt1.getSize();
        belt1.getBuckleType();
        belt1.getStyle();

        System.out.println("-------------------");
        Belt belt2 = new LeatherBelt();
        belt2.getMaterial();
        belt2.getColor();
        belt2.getSize();
        belt2.getBuckleType();
        belt2.getStyle();

        System.out.println("-----------------");
        LeatherBelt leatherBelt = new LeatherBelt();
        leatherBelt.getMaterial();
        leatherBelt.getColor();
        leatherBelt.getSize();
        leatherBelt.getBuckleType();
        leatherBelt.getStyle();
        leatherBelt.getDurability();

        System.out.println("------------------");
        BeltStore beltStore = new BeltStore();
        beltStore.manage(belt2);
        beltStore.manage(belt1);
        beltStore.manage(leatherBelt);
    }
}
