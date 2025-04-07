package com.xworkz.override47;

public class LuxuryPerfume extends Perfume {
    public LuxuryPerfume() {
        super();
        System.out.println("Running non-arg constructor LuxuryPerfume--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Luxury Perfume brand is high-end like Chanel or Dior--child");
    }

    @Override
    public void getFragrance() {
        System.out.println("Luxury Perfume fragrance is exclusive and rich--child");
    }

    @Override
    public void getSize() {
        System.out.println("Luxury Perfume comes in 50ml, 100ml, or larger sizes--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Luxury Perfume is expensive, typically starting at $100--child");
    }

    @Override
    public void getBottleType() {
        System.out.println("Luxury Perfume comes in a crystal or elegant glass bottle--child");
    }

    public void getExclusivity() {
        System.out.println("Luxury Perfume is exclusive and produced in limited quantities--child only method");
    }
}