package com.xworkz.override44;

public class HerbalFacewash extends Facewash {
    public HerbalFacewash() {
        super();
        System.out.println("Running non-arg constructor HerbalFacewash--child");
    }

    @Override
    public void getType() {
        System.out.println("Herbal facewash contains natural ingredients for gentle cleansing--child");
    }

    @Override
    public void getIngredients() {
        System.out.println("Herbal facewash contains ingredients like neem, aloe vera, and turmeric--child");
    }

    @Override
    public void getFragrance() {
        System.out.println("Herbal facewash has a mild herbal fragrance--child");
    }

    @Override
    public void getSkinType() {
        System.out.println("Herbal facewash is suitable for sensitive and dry skin--child");
    }

    @Override
    public void getSize() {
        System.out.println("Herbal facewash is available in sizes like 100ml, 150ml--child");
    }

    public void getSkinBenefits() {
        System.out.println("Herbal facewash provides skin nourishment and hydration--child only method");
    }
}