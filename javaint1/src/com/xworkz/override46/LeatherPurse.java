package com.xworkz.override46;

public class LeatherPurse  extends Purse {
    public LeatherPurse() {
        super();
        System.out.println("Running non-arg constructor LeatherPurse--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Leather purse is made of high-quality leather--child");
    }

    @Override
    public void getColor() {
        System.out.println("Leather purse comes in classic colors like black, brown, and tan--child");
    }

    @Override
    public void getSize() {
        System.out.println("Leather purse size varies, but it’s usually medium to large--child");
    }

    @Override
    public void getDesign() {
        System.out.println("Leather purse has a sophisticated and elegant design--child");
    }

    @Override
    public void getClosureType() {
        System.out.println("Leather purse typically has a zipper or magnetic clasp--child");
    }

    public void getDurability() {
        System.out.println("Leather purse is highly durable and can last for many years--child only method");
    }
}