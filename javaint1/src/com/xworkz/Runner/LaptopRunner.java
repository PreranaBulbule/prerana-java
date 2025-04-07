package com.xworkz.Runner;
import com.xworkz.override6.Laptop;
import com.xworkz.override6.LaptopStore;
import com.xworkz.override6.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.getBrand();
        laptop1.getProcessor();
        laptop1.getRam();
        laptop1.getStorage();
        laptop1.getPrice();

        System.out.println("-------------------");
        Laptop laptop2 = new GamingLaptop();
        laptop2.getBrand();
        laptop2.getProcessor();
        laptop2.getRam();
        laptop2.getStorage();
        laptop2.getPrice();

        System.out.println("-----------------");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.getBrand();
        gamingLaptop.getProcessor();
        gamingLaptop.getRam();
        gamingLaptop.getStorage();
        gamingLaptop.getPrice();
        gamingLaptop.getGraphicsCard();

        System.out.println("------------------");
        LaptopStore laptopStore = new LaptopStore();
        laptopStore.manage(laptop2);
        laptopStore.manage(laptop1);
        laptopStore.manage(gamingLaptop);
    }
}
