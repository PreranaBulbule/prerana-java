package com.xworkz.casting.Internal;

public class Poster {
    private String theme;
    private String size;
    private double price;

    public Poster(String theme, String size, double price) {
        this.theme = theme;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Poster [theme=" + theme + ", size=" + size + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("PosterHashCode (from super): " + super.hashCode());
        return 3300;
    }
}
