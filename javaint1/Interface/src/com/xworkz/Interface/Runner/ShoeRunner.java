package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Shoe;
import com.xworkz.Interface.Internal.LeatherShoePackagerImpl;

public class ShoeRunner {
    public static void main(String[] args) {
        LeatherShoePackagerImpl packager = new LeatherShoePackagerImpl();
        Shoe shoe = new Shoe(packager);
        shoe.startPackaging();
    }
}
