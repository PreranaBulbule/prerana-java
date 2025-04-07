package com.xworkz.override23;

public class ButtonSwitch extends Switch {
    public ButtonSwitch() {
        super();
        System.out.println("Running non-arg constructor ButtonSwitch--child");
    }

    @Override
    public void getType() {
        System.out.println("Button switch type--child");
    }

    @Override
    public void getColor() {
        System.out.println("Button switch color is white--child");
    }

    @Override
    public void getSize() {
        System.out.println("Button switch size is small--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Button switch brand is XYZ--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Button switch price is $5--child");
    }

    public void getSwitchingMechanism() {
        System.out.println("Button switch uses mechanical action--child only method");
    }
}