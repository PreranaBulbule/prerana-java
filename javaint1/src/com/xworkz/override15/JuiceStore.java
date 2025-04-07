package com.xworkz.override15;

public class JuiceStore {
    public void manage(Juice juice) {
        juice.getFlavor();
        juice.getColor();
        juice.getSize();
        juice.getPrice();
        juice.getType();

        if (juice instanceof OrangeJuice) {
            System.out.println("Juice is instance of OrangeJuice");
            OrangeJuice orangeJuice = (OrangeJuice) juice;
            orangeJuice.getVitaminCContent();
        }
    }
}

