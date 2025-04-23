package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Lipstick;
import com.xworkz.Interface.Internal.MatteLipstickPackagerImpl;

public class LipstickRunner {
    public static void main(String[] args) {
        MatteLipstickPackagerImpl packager = new MatteLipstickPackagerImpl();
        Lipstick lipstick = new Lipstick(packager);
        lipstick.startPackaging();
    }
}
