package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.McDonalds;
import com.xworkz.Interface.Internal.BurgerMcDonaldsPackagerImpl;

public class McDonaldsRunner {
    public static void main(String[] args) {
        BurgerMcDonaldsPackagerImpl packager = new BurgerMcDonaldsPackagerImpl();
        McDonalds mcDonalds = new McDonalds(packager);
        mcDonalds.startPackaging();
    }
}
