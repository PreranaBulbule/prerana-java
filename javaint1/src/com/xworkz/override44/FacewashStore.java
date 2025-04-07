package com.xworkz.override44;

public class FacewashStore {
    public void manage(Facewash facewash) {
        facewash.getType();
        facewash.getIngredients();
        facewash.getFragrance();
        facewash.getSkinType();
        facewash.getSize();

        if (facewash instanceof HerbalFacewash) {
            System.out.println("Facewash is instance of HerbalFacewash");
            HerbalFacewash herbalFacewash = (HerbalFacewash) facewash;
            herbalFacewash.getSkinBenefits();
        }
    }

}
