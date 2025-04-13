package com.xworkz.casting.Internal;

public class Window {
    private String material;
    private String type;
    private double price;

    public Window(String material, String type, double price) {
        this.material = material;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Window{material='" + material + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Window hashCode: " + super.hashCode());
        return 12345;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Window) {
                Window w1 = this;
                Window w2 = (Window) obj;
                if (w1.material.equals(w2.material) &&
                        w1.type.equals(w2.type) &&
                        w1.price == w2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
