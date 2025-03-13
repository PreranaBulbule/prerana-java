class TubeLight {
    void setWattage(int watt) { System.out.println("TubeLight Wattage: " + watt + "W"); }
    void setLength(String length) { System.out.println("TubeLight Length: " + length); }
    void setBrand(String brand) { System.out.println("TubeLight Brand: " + brand); }
    void setPrice(String brand, int price) { System.out.println(brand + " TubeLight Price: $" + price); }
    void setStock(String brand, int quantity) { System.out.println(brand + " Stock: " + quantity); }
    void setDetails(String brand, int price, String length) { System.out.println("TubeLight: " + brand + ", Price: $" + price + ", Length: " + length); }
    void applyDiscount(String brand, int price, int discount) { System.out.println(brand + " after discount: $" + (price - discount)); }

    void displayAll() {
        setWattage(20); setLength("4ft"); setBrand("Philips");
        setPrice("Philips", 15); setStock("Philips", 100);
        setDetails("Philips", 15, "4ft");
        applyDiscount("Philips", 15, 3);
    }
}
class Main {
    public static void main(String[] args) {
        new Ladder().displayAll();
        new FoodItem().displayAll();
        new Paper().displayAll();
        new Beer().displayAll();
        new WhiteBoard().displayAll();
        new TeddyBear().displayAll();
        new TubeLight().displayAll();
    }
}

