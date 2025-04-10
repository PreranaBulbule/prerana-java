package com.xworkz.casting.Internal;

public class Purse {
        private String brand;
        private String color;
        private double price;

        public Purse(String brand, String color, double price) {
            this.brand = brand;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Purse [brand=" + brand + ", color=" + color + ", price=" + price + "]";

    }
    @Override
    public int hashCode() {
        System.out.println("PurseHashCode (from super): " + super.hashCode());
        return 3400;
    }
}
