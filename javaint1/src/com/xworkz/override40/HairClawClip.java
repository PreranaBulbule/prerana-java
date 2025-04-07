package com.xworkz.override40;

public class HairClawClip extends ClawClip {
    public HairClawClip() {
        super();
        System.out.println("Running non-arg constructor HairClawClip--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Hair claw clip is made of plastic--child");
    }

    @Override
    public void getColor() {
        System.out.println("Hair claw clip is black--child");
    }

    @Override
    public void getSize() {
        System.out.println("Hair claw clip size is small--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Hair claw clip price is $2--child");
    }

    @Override
    public void getShape() {
        System.out.println("Hair claw clip is a round shape--child");
    }

    public void getGripType() {
        System.out.println("Hair claw clip has a strong grip--child only method");
    }
}