package com.xworkz.casting.Internal;

public class Poster {
    private String type;
    private String size;
    private double price;

    public Poster(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PosterHashCode: " + super.hashCode());
        return 1234;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Poster) {
                Poster poster1 = this;
                Poster poster2 = (Poster) obj;
                if (poster1.type.equals(poster2.type) && poster1.size.equals(poster2.size) && poster1.price == poster2.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
