package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Foundation;
import com.xworkz.Interface.Internal.LiquidFoundationPackagerImpl;

public class FoundationRunner {
    public static void main(String[] args) {
        LiquidFoundationPackagerImpl packager = new LiquidFoundationPackagerImpl();
        Foundation foundation = new Foundation(packager);
        foundation.startPackaging();
    }
}
