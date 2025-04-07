package com.xworkz.Runner;
import com.xworkz.override27.Duster;
import com.xworkz.override27.DusterStore;
import com.xworkz.override27.MicrofiberDuster;

public class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster();
        duster1.getBrand();
        duster1.getMaterial();
        duster1.getSize();
        duster1.getColor();
        duster1.getPrice();

        System.out.println("-------------------");
        Duster duster2 = new MicrofiberDuster();
        duster2.getBrand();
        duster2.getMaterial();
        duster2.getSize();
        duster2.getColor();
        duster2.getPrice();

        System.out.println("-----------------");
        MicrofiberDuster microfiberDuster = new MicrofiberDuster();
        microfiberDuster.getBrand();
        microfiberDuster.getMaterial();
        microfiberDuster.getSize();
        microfiberDuster.getColor();
        microfiberDuster.getPrice();
        microfiberDuster.getWashability();

        System.out.println("------------------");
        DusterStore dusterStore = new DusterStore();
        dusterStore.manage(duster2);
        dusterStore.manage(duster1);
        dusterStore.manage(microfiberDuster);
    }
}
