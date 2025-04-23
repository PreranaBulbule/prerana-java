package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Chair;
import com.xworkz.Interface.Internal.WoodenChairPackagerImpl;

public class ChairRunner {
    public static void main(String[] args) {
        WoodenChairPackagerImpl packager = new WoodenChairPackagerImpl();
        Chair chair = new Chair(packager);
        chair.startPackaging();
    }
}
