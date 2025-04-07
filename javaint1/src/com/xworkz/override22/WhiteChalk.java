package com.xworkz.override22;

public class WhiteChalk extends Chalk {
    public WhiteChalk() {
        super();
        System.out.println("Running non-arg constructor WhiteChalk--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("White chalk is made of calcium carbonate--child");
    }

    @Override
    public void getColor() {
        System.out.println("White chalk is white in color--child");
    }

    @Override
    public void getSize() {
        System.out.println("White chalk size is small--child");
    }

    @Override
    public void getPrice() {
        System.out.println("White chalk price is $1 per pack--child");
    }

    @Override
    public void getType() {
        System.out.println("White chalk is used for blackboards--child");
    }

    public void getDustLevel() {
        System.out.println("White chalk has low dust--child only method");
    }
}