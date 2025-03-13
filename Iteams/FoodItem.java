class FoodItem {
    void setName(String name) { System.out.println("Food Name: " + name); }
    void setCalories(int calories) { System.out.println("Calories: " + calories + " kcal"); }
    void setCategory(String category) { System.out.println("Category: " + category); }
    void setPrice(String name, int price) { System.out.println(name + " Price: $" + price); }
    void setStock(String name, int quantity) { System.out.println(name + " Stock: " + quantity); }
    void setFoodDetails(String name, int price, String category) { System.out.println("Food: " + name + ", Price: $" + price + ", Category: " + category); }
    void applyDiscount(String name, int price, int discount) { System.out.println(name + " after discount: $" + (price - discount)); }

    void displayAll() {
        setName("Pizza"); setCalories(300); setCategory("Fast Food");
        setPrice("Pizza", 12); setStock("Pizza", 50);
        setFoodDetails("Pizza", 12, "Fast Food");
        applyDiscount("Pizza", 12, 2);
    }
}

