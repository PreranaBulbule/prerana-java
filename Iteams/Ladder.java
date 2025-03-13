class Ladder {
    void setMaterial(String material) { System.out.println("Ladder Material: " + material); }
    void setHeight(int height) { System.out.println("Ladder Height: " + height + " ft"); }
    void setColor(String color) { System.out.println("Ladder Color: " + color); }
    void setDetails(String type, int steps) { System.out.println("Ladder Type: " + type + ", Steps: " + steps); }
    void setUsage(String type, int weightCapacity) { System.out.println(type + " Ladder supports " + weightCapacity + " kg"); }
    void setFullDetails(String type, int steps, String material) { System.out.println("Ladder Type: " + type + ", Steps: " + steps + ", Material: " + material); }
    void calculatePrice(String type, int steps, int basePrice) { System.out.println(type + " Ladder Final Price: $" + (basePrice + (steps * 10))); }

    void displayAll() {
        setMaterial("Aluminum"); setHeight(10); setColor("Red");
        setDetails("Foldable", 5); setUsage("Indoor", 120);
        setFullDetails("Extendable", 8, "Steel");
        calculatePrice("Foldable", 5, 100);
    }
}
