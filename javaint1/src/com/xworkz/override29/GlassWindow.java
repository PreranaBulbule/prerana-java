package com.xworkz.override29;

public class GlassWindow extends Window {
    public GlassWindow() {
        super();
        System.out.println("Running non-arg constructor GlassWindow--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("GlassWindow is made of glass--child");
    }

    @Override
    public void getSize() {
        System.out.println("GlassWindow size is medium--child");
    }

    @Override
    public void getType() {
        System.out.println("GlassWindow is a sliding window--child");
    }

    @Override
    public void getColor() {
        System.out.println("GlassWindow color is clear--child");
    }

    @Override
    public void getPrice() {
        System.out.println("GlassWindow price is $200--child");
    }

    public void getTransparency() {
        System.out.println("GlassWindow transparency is high--child only method");
    }
}