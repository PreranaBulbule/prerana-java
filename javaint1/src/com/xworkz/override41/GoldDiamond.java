package com.xworkz.override41;

public class GoldDiamond extends Diamond {
    public GoldDiamond() {
        super();
        System.out.println("Running non-arg constructor GoldDiamond--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Gold diamond is made of gold and diamond--child");
    }

    @Override
    public void getColor() {
        System.out.println("Gold diamond is golden in color--child");
    }

    @Override
    public void getSize() {
        System.out.println("Gold diamond size is small--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Gold diamond price is expensive--child");
    }

    @Override
    public void getShape() {
        System.out.println("Gold diamond shape is oval--child");
    }

    public void getGoldContent() {
        System.out.println("Gold diamond has high gold content--child only method");
    }
}