package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Duster;
import com.xworkz.Interface.Internal.MicrofiberDusterPackagerImpl;

public class DusterRunner {
    public static void main(String[] args) {
        MicrofiberDusterPackagerImpl packager = new MicrofiberDusterPackagerImpl();
        Duster duster = new Duster(packager);
        duster.startPackaging();
    }
}
