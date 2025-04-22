package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Tomato;
import com.xworkz.Interface.Internal.OrganicTomatoPackagerImpl;

public class TomatoRunner {
    public static void main(String[] args) {
        OrganicTomatoPackagerImpl packager = new OrganicTomatoPackagerImpl();
        Tomato tomato = new Tomato(packager);
        tomato.startPackaging();
    }
}
