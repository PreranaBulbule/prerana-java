package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Mug;
import com.xworkz.Interface.Internal.CeramicMugPackagerImpl;

public class MugRunner {
    public static void main(String[] args) {
        CeramicMugPackagerImpl packager = new CeramicMugPackagerImpl();
        Mug mug = new Mug(packager);
        mug.startPackaging();
    }
}
