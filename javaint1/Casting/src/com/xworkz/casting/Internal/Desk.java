package com.xworkz.casting.Internal;

public class Desk {
        private String material;
        private String color;
        private double price;

        public Desk(String material, String color, double price) {
            this.material = material;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Desk [material=" + material + ", color=" + color + ", price=" + price + "]";
        }
    @Override
    public int hashCode() {
        System.out.println("DeskHashCode (from super): " + super.hashCode());
        return 1300;
    }
}
