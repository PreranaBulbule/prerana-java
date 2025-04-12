package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bluetooth;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth sonyBluetooth = new Bluetooth("Sony", "Wireless", 3000.00);
        System.out.println(sonyBluetooth);
        System.out.println("Custom hashCode (overridden): " + sonyBluetooth.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sonyBluetooth));

        Bluetooth bluetooth1 = new Bluetooth();
        bluetooth1.setBrand("Sony");

        Bluetooth bluetooth2 = new Bluetooth();
        bluetooth2.setBrand("Sony");

        boolean same = bluetooth1.equals(bluetooth2);
        System.out.println("Both same brand: " + same);
    }
}


