package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Mobile;
import com.xworkz.Interface.Internal.SmartphoneMobilePackagerImpl;

public class MobileRunner {
    public static void main(String[] args) {
        SmartphoneMobilePackagerImpl packager = new SmartphoneMobilePackagerImpl();
        Mobile mobile = new Mobile(packager);
        mobile.startPackaging();
    }
}
