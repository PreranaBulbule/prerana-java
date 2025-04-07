package com.xworkz.override34;

public class DressStore {
    public void manage(Dress dress) {
        dress.getFabric();
        dress.getColor();
        dress.getSize();
        dress.getStyle();
        dress.getPrice();

        if (dress instanceof FormalDress) {
            System.out.println("Dress is instance of FormalDress");
            FormalDress formalDress = (FormalDress) dress;
            formalDress.getOccasion();
        }
    }

}
