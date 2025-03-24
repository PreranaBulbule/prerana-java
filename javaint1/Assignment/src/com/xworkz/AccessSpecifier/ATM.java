package com.xworkz.AccessSpecifier;

public class ATM {
    private int pinCode;

    private void verifyPin() {
        System.out.println("Verifying PIN...");
    }

    public void setPin(int pin) {
        this.pinCode = pin;
        verifyPin();
    }
}

