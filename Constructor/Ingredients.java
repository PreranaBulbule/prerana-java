class Ingredients {
	
    static String[] getIngredients(String food) {
        if (food.equalsIgnoreCase("Pizza")) {
            return new String[]{"Dough", "Tomato Sauce", "Cheese", "Flakes"};
        } else if (food.equalsIgnoreCase("Burger")) {
            return new String[]{"Bun", "Corn", "Paneer", "Tomato", "Cheese"};
        } else if (food.equalsIgnoreCase("Pasta")) {
            return new String[]{"Pasta", "Olive Oil", "Garlic", "Tomato Sauce"};
        } else {
            return new String[]{"Unknown Ingredients"};
        }
    }

    public static void main(String[] args) {
        String foodItem = "Pizza"; 
        String[] ingredients = getIngredients(foodItem);

        System.out.println("Ingredients for " + foodItem + ":");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println("- " + ingredients[i]);
        }
    }
}