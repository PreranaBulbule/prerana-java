class Paper {
    void setType(String type) { System.out.println("Paper Type: " + type); }
    void setSize(String size) { System.out.println("Paper Size: " + size); }
    void setWeight(int weight) { System.out.println("Paper Weight: " + weight + "g"); }
    void setBrand(String brand, String type) { System.out.println("Brand: " + brand + ", Type: " + type); }
    void setStock(String brand, int quantity) { System.out.println(brand + " Stock: " + quantity); }
    void setDetails(String type, String size, int weight) { System.out.println("Details: " + type + ", " + size + ", " + weight + "g"); }
    void applyDiscount(String brand, int price, int discount) { System.out.println(brand + " after discount: $" + (price - discount)); }

    void displayAll() {
        setType("A4"); setSize("210x297mm"); setWeight(80);
        setBrand("HP", "Printer Paper"); setStock("HP", 100);
        setDetails("A4", "210x297mm", 80);
        applyDiscount("HP", 10, 2);
    }
}
