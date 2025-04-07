package com.xworkz.Runner;
import com.xworkz.override26.Knife;
import com.xworkz.override26.KnifeStore;
import com.xworkz.override26.ChefKnife;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife knife1 = new Knife();
        knife1.getBrand();
        knife1.getType();
        knife1.getSize();
        knife1.getMaterial();
        knife1.getPrice();

        System.out.println("-------------------");
        Knife knife2 = new ChefKnife();
        knife2.getBrand();
        knife2.getType();
        knife2.getSize();
        knife2.getMaterial();
        knife2.getPrice();

        System.out.println("-----------------");
        ChefKnife chefKnife = new ChefKnife();
        chefKnife.getBrand();
        chefKnife.getType();
        chefKnife.getSize();
        chefKnife.getMaterial();
        chefKnife.getPrice();
        chefKnife.getSharpness();

        System.out.println("------------------");
        KnifeStore knifeStore = new KnifeStore();
        knifeStore.manage(knife2);
        knifeStore.manage(knife1);
        knifeStore.manage(chefKnife);
    }
}
