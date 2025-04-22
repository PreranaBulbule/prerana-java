package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.BagPacker;

public class Bag {
    private BagPacker packer;

    public Bag(BagPacker packer) {
        this.packer = packer;
    }

    public void startPacking() {
        System.out.println("Starting the bag packing process");
        if (this.packer != null) {
            this.packer.pack();
        } else {
            System.out.println("Packer not available");
        }
    }
}
