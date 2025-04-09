package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bluetooth;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth sonyBluetooth = new Bluetooth("Sony", "Wireless", 3000.00);
        System.out.println(sonyBluetooth);
    }}
