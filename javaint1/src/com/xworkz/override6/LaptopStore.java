package com.xworkz.override6;

public class LaptopStore {
    public void manage(Laptop laptop) {
        laptop.getBrand();
        laptop.getProcessor();
        laptop.getRam();
        laptop.getStorage();
        laptop.getPrice();

        if(laptop instanceof GamingLaptop) {
            System.out.println("Laptop is instance of GamingLaptop");
            GamingLaptop gamingLaptop = (GamingLaptop) laptop;
            gamingLaptop.getGraphicsCard();
        }
    }
}

