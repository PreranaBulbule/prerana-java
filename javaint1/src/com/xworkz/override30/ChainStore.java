package com.xworkz.override30;

public class ChainStore {
    public void manage(Chain chain) {
        chain.getMaterial();
        chain.getLength();
        chain.getType();
        chain.getColor();
        chain.getPrice();

        if (chain instanceof GoldChain) {
            System.out.println("Chain is instance of GoldChain");
            GoldChain goldChain = (GoldChain) chain;
            goldChain.getPurity();
        }
    }

}
