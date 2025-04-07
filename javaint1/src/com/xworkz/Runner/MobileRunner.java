package com.xworkz.Runner;
import com.xworkz.override8.Mobile;
import com.xworkz.override8.MobileStore;
import com.xworkz.override8.Smartphone;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.getBrand();
        mobile1.getModel();
        mobile1.getProcessor();
        mobile1.getStorage();
        mobile1.getPrice();

        System.out.println("-------------------");
        Mobile mobile2 = new Smartphone();
        mobile2.getBrand();
        mobile2.getModel();
        mobile2.getProcessor();
        mobile2.getStorage();
        mobile2.getPrice();

        System.out.println("-----------------");
        Smartphone smartphone = new Smartphone();
        smartphone.getBrand();
        smartphone.getModel();
        smartphone.getProcessor();
        smartphone.getStorage();
        smartphone.getPrice();
        smartphone.getCamera();

        System.out.println("------------------");
        MobileStore mobileStore = new MobileStore();
        mobileStore.manage(mobile2);
        mobileStore.manage(mobile1);
        mobileStore.manage(smartphone);
    }
}
