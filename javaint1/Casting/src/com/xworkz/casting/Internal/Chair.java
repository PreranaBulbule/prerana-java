package com.xworkz.casting.Internal;

public class Chair {
        private String type;
        private String material;
        private double price;

        public Chair(String type, String material, double price) {
            this.type = type;
            this.material = material;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Chair [type=" + type + ", material=" + material + ", price=" + price + "]";
        }
    }

