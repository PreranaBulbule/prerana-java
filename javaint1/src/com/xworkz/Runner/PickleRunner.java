package com.xworkz.Runner;
import com.xworkz.override36.Pickle;
import com.xworkz.override36.MangoPickle;
import com.xworkz.override36.PickleStore;

public class PickleRunner {
    public static void main(String[] args) {
        Pickle pickle1 = new Pickle();
        pickle1.getType();
        pickle1.getFlavor();
        pickle1.getSpiciness();
        pickle1.getShelfLife();
        pickle1.getPrice();

        System.out.println("-------------------");
        Pickle pickle2 = new MangoPickle();
        pickle2.getType();
        pickle2.getFlavor();
        pickle2.getSpiciness();
        pickle2.getShelfLife();
        pickle2.getPrice();

        System.out.println("-----------------");
        MangoPickle mangoPickle = new MangoPickle();
        mangoPickle.getType();
        mangoPickle.getFlavor();
        mangoPickle.getSpiciness();
        mangoPickle.getShelfLife();
        mangoPickle.getPrice();
        mangoPickle.getRegion();

        System.out.println("------------------");
        PickleStore pickleStore = new PickleStore();
        pickleStore.manage(pickle2);
        pickleStore.manage(pickle1);
        pickleStore.manage(mangoPickle);
    }
}
