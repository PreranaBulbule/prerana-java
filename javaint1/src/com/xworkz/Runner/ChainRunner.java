package com.xworkz.Runner;
import com.xworkz.override30.Chain;
import com.xworkz.override30.ChainStore;
import com.xworkz.override30.GoldChain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain chain1 = new Chain();
        chain1.getMaterial();
        chain1.getLength();
        chain1.getType();
        chain1.getColor();
        chain1.getPrice();

        System.out.println("-------------------");
        Chain chain2 = new GoldChain();
        chain2.getMaterial();
        chain2.getLength();
        chain2.getType();
        chain2.getColor();
        chain2.getPrice();

        System.out.println("-----------------");
        GoldChain goldChain = new GoldChain();
        goldChain.getMaterial();
        goldChain.getLength();
        goldChain.getType();
        goldChain.getColor();
        goldChain.getPrice();
        goldChain.getPurity();

        System.out.println("------------------");
        ChainStore chainStore = new ChainStore();
        chainStore.manage(chain2);
        chainStore.manage(chain1);
        chainStore.manage(goldChain);
    }
}
