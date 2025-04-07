package com.xworkz.Runner;
import com.xworkz.override49.Shower;
import com.xworkz.override49.LuxuryShower;
import com.xworkz.override49.ShowerStore;

public class ShowerRunner {
    public static void main(String[] args) {
        Shower shower1 = new Shower();
        shower1.getMaterial();
        shower1.getSize();
        shower1.getWeight();
        shower1.getColor();
        shower1.getFunction();

        System.out.println("-------------------");
        Shower shower2 = new LuxuryShower();
        shower2.getMaterial();
        shower2.getSize();
        shower2.getWeight();
        shower2.getColor();
        shower2.getFunction();

        System.out.println("-----------------");
        LuxuryShower luxuryShower = new LuxuryShower();
        luxuryShower.getMaterial();
        luxuryShower.getSize();
        luxuryShower.getWeight();
        luxuryShower.getColor();
        luxuryShower.getFunction();
        luxuryShower.getWaterPressure();

        System.out.println("------------------");
        ShowerStore showerStore = new ShowerStore();
        showerStore.manage(shower2);
        showerStore.manage(shower1);
        showerStore.manage(luxuryShower);
    }
}
