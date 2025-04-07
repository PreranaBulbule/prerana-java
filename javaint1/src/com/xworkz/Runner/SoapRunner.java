package com.xworkz.Runner;
import com.xworkz.override18.Soap;
import com.xworkz.override18.SoapStore;
import com.xworkz.override18.BathSoap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap1 = new Soap();
        soap1.getType();
        soap1.getBrand();
        soap1.getColor();
        soap1.getPrice();
        soap1.getSize();

        System.out.println("-------------------");
        Soap soap2 = new BathSoap();
        soap2.getType();
        soap2.getBrand();
        soap2.getColor();
        soap2.getPrice();
        soap2.getSize();

        System.out.println("-----------------");
        BathSoap bathSoap = new BathSoap();
        bathSoap.getType();
        bathSoap.getBrand();
        bathSoap.getColor();
        bathSoap.getPrice();
        bathSoap.getSize();
        bathSoap.getFragrance();

        System.out.println("------------------");
        SoapStore soapStore = new SoapStore();
        soapStore.manage(soap2);
        soapStore.manage(soap1);
        soapStore.manage(bathSoap);
    }
}