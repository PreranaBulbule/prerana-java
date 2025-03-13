class Beer {
    void setBrand(String brand) { System.out.println("Beer Brand: " + brand); }
    void setAlcoholContent(double alcohol) { System.out.println("Alcohol Content: " + alcohol + "%"); }
    void setType(String type) { System.out.println("Beer Type: " + type); }
    void setPrice(String brand, int price) { System.out.println(brand + " Beer Price: $" + price); }
    void setStock(String brand, int quantity) { System.out.println(brand + " Beer Stock: " + quantity); }
    void setBeerDetails(String brand, int price, double alcohol) { System.out.println("Beer: " + brand + ", Price: $" + price + ", Alcohol: " + alcohol + "%"); }
    void applyDiscount(String brand, int price, int discount) { System.out.println(brand + " Beer after discount: $" + (price - discount)); }

    void displayAll() {
        setBrand("Corona"); setAlcoholContent(5.0); setType("Lager");
        setPrice("Corona", 10); setStock("Corona", 100);
        setBeerDetails("Corona", 10, 5.0);
        applyDiscount("Corona", 10, 2);
    }
}