package com.xworkz.Runner;
import com.xworkz.override34.Dress;
import com.xworkz.override34.FormalDress;
import com.xworkz.override34.DressStore;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress1 = new Dress();
        dress1.getFabric();
        dress1.getColor();
        dress1.getSize();
        dress1.getStyle();
        dress1.getPrice();

        System.out.println("-------------------");
        Dress dress2 = new FormalDress();
        dress2.getFabric();
        dress2.getColor();
        dress2.getSize();
        dress2.getStyle();
        dress2.getPrice();

        System.out.println("-----------------");
        FormalDress formalDress = new FormalDress();
        formalDress.getFabric();
        formalDress.getColor();
        formalDress.getSize();
        formalDress.getStyle();
        formalDress.getPrice();
        formalDress.getOccasion();

        System.out.println("------------------");
        DressStore dressStore = new DressStore();
        dressStore.manage(dress2);
        dressStore.manage(dress1);
        dressStore.manage(formalDress);
    }
}
