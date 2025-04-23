package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Fortuner;
import com.xworkz.Interface.Internal.LuxuryFortunerPackagerImpl;

public class FortunerRunner {
    public static void main(String[] args) {
        LuxuryFortunerPackagerImpl packager = new LuxuryFortunerPackagerImpl();
        Fortuner fortuner = new Fortuner(packager);
        fortuner.startPackaging();
    }
}
