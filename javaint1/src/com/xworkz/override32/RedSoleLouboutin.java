package com.xworkz.override32;

public class RedSoleLouboutin extends Louboutin {
    public RedSoleLouboutin() {
        super();
        System.out.println("Running non-arg constructor RedSoleLouboutin--child");
    }

    @Override
    public void getBrand() {
        System.out.println("RedSoleLouboutin is a premium luxury brand--child");
    }

    @Override
    public void getColor() {
        System.out.println("RedSoleLouboutin shoes are mostly red, black, or nude--child");
    }

    @Override
    public void getSize() {
        System.out.println("RedSoleLouboutin shoes are available in various sizes--child");
    }

    @Override
    public void getPrice() {
        System.out.println("RedSoleLouboutin shoes price starts at $500--child");
    }

    @Override
    public void getType() {
        System.out.println("RedSoleLouboutin is a luxury high-heeled shoe--child");
    }

    public void getIconicRedSole() {
        System.out.println("RedSoleLouboutin is known for its iconic red sole--child only method");
    }
}