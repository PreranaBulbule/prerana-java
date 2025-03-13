class TeddyBear {
    void setName(String name) { System.out.println("TeddyBear Name: " + name); }
    void setSize(String size) { System.out.println("TeddyBear Size: " + size); }
    void setColor(String color) { System.out.println("TeddyBear Color: " + color); }
    void setPrice(String name, int price) { System.out.println(name + " TeddyBear Price: $" + price); }
    void setStock(String name, int quantity) { System.out.println(name + " Stock: " + quantity); }
    void setDetails(String name, int price, String size) { System.out.println("TeddyBear: " + name + ", Price: $" + price + ", Size: " + size); }
    void applyDiscount(String name, int price, int discount) { System.out.println(name + " after discount: $" + (price - discount)); }

    void displayAll() {
        setName("Fluffy"); setSize("Medium"); setColor("Brown");
        setPrice("Fluffy", 20); setStock("Fluffy", 50);
        setDetails("Fluffy", 20, "Medium");
        applyDiscount("Fluffy", 20, 5);
    }
}
