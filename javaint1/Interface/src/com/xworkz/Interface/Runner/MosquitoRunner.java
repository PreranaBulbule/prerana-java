package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Mosquito;
import com.xworkz.Interface.Internal.ElectricMosquitoPackagerImpl;

public class MosquitoRunner {
    public static void main(String[] args) {
        ElectricMosquitoPackagerImpl packager = new ElectricMosquitoPackagerImpl();
        Mosquito mosquito = new Mosquito(packager);
        mosquito.startPackaging();
    }
}
