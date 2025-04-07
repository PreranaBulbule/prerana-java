package com.xworkz.override18;

public class SoapStore {
    public void manage(Soap soap) {
        soap.getType();
        soap.getBrand();
        soap.getColor();
        soap.getPrice();
        soap.getSize();

        if (soap instanceof BathSoap) {
            System.out.println("Soap is instance of BathSoap");
            BathSoap bathSoap = (BathSoap) soap;
            bathSoap.getFragrance();
        }
    }
}

