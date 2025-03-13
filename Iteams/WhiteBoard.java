class WhiteBoard {
    void setSize(String size) { System.out.println("WhiteBoard Size: " + size); }
    void setFrameMaterial(String material) { System.out.println("Frame Material: " + material); }
    void setColor(String color) { System.out.println("WhiteBoard Color: " + color); }
    void setPrice(String size, int price) { System.out.println(size + " WhiteBoard Price: $" + price); }
    void setStock(String size, int quantity) { System.out.println(size + " WhiteBoard Stock: " + quantity); }
    void setBoardDetails(String size, int price, String material) { System.out.println("WhiteBoard Size: " + size + ", Price: $" + price + ", Material: " + material); }
    void applyDiscount(String size, int price, int discount) { System.out.println(size + " WhiteBoard after discount: $" + (price - discount)); }

    void displayAll() {
        setSize("4x6"); setFrameMaterial("Wood"); setColor("White");
        setPrice("4x6", 30); setStock("4x6", 50);
        setBoardDetails("4x6", 30, "Wood");
        applyDiscount("4x6", 30, 5);
    }
}