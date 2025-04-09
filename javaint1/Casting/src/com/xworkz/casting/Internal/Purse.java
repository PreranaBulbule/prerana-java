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
}
