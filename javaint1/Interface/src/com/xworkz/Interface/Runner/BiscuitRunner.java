package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Biscuit;
import com.xworkz.Interface.Internal.ParlePackagerImpl;

public class BiscuitRunner {
    public static void main(String[] args) {
        ParlePackagerImpl packager = new ParlePackagerImpl();
        Biscuit biscuit = new Biscuit(packager);
        biscuit.startPackaging();
    }
}
