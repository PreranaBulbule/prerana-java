package com.xworkz.Runner;
import com.xworkz.override44.Facewash;
import com.xworkz.override44.HerbalFacewash;
import com.xworkz.override44.FacewashStore;

public class FacewashRunner {
    public static void main(String[] args) {
        Facewash facewash1 = new Facewash();
        facewash1.getType();
        facewash1.getIngredients();
        facewash1.getFragrance();
        facewash1.getSkinType();
        facewash1.getSize();

        System.out.println("-------------------");
        Facewash facewash2 = new HerbalFacewash();
        facewash2.getType();
        facewash2.getIngredients();
        facewash2.getFragrance();
        facewash2.getSkinType();
        facewash2.getSize();

        System.out.println("-----------------");
        HerbalFacewash herbalFacewash = new HerbalFacewash();
        herbalFacewash.getType();
        herbalFacewash.getIngredients();
        herbalFacewash.getFragrance();
        herbalFacewash.getSkinType();
        herbalFacewash.getSize();
        herbalFacewash.getSkinBenefits();

        System.out.println("------------------");
        FacewashStore facewashStore = new FacewashStore();
        facewashStore.manage(facewash2);
        facewashStore.manage(facewash1);
        facewashStore.manage(herbalFacewash);
    }
}
