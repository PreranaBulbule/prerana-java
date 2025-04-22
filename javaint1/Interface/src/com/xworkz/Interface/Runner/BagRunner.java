package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Bag;
import com.xworkz.Interface.Internal.WildcraftPackerImpl;

public class BagRunner {
    public static void main(String[] args) {
        WildcraftPackerImpl packer = new WildcraftPackerImpl();
        Bag bag = new Bag(packer);
        bag.startPacking();
    }
}
