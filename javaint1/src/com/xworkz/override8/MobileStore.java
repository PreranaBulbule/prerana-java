package com.xworkz.override8;

public class MobileStore {
    public void manage(Mobile mobile) {
        mobile.getBrand();
        mobile.getModel();
        mobile.getProcessor();
        mobile.getStorage();
        mobile.getPrice();

        if (mobile instanceof Smartphone) {
            System.out.println("Mobile is instance of Smartphone");
            Smartphone smartphone = (Smartphone) mobile;
            smartphone.getCamera();
        }
    }
}

