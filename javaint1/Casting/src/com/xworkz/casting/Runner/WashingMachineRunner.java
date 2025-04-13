package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine lgWashingMachine = new WashingMachine("LG", "Front Load", 35000.00);
        System.out.println(lgWashingMachine);
        System.out.println("Custom hashCode (overridden): " + lgWashingMachine.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(lgWashingMachine));

        WashingMachine wm1 = new WashingMachine("LG", "Front Load", 35000.00);
        WashingMachine wm2 = new WashingMachine("LG", "Front Load", 35000.00);
        boolean same = wm1.equals(wm2);
        System.out.println("Both WashingMachine objects are the same: " + same);

        WashingMachine wm3 = new WashingMachine("Samsung", "Top Load", 30000.00);
        boolean different = wm1.equals(wm3);
        System.out.println("Both WashingMachine objects are the same: " + different);
    }
}
