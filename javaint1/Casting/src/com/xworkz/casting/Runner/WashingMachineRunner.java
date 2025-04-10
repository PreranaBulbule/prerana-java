package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine lgWashingMachine = new WashingMachine("LG", "Front Load", 35000.00);
        System.out.println(lgWashingMachine);
        System.out.println("Custom hashCode (overridden): " + lgWashingMachine.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(lgWashingMachine));
    }
}
