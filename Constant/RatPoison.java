class RatPoison {
    
    String activeIngredient;
    double concentration;
    boolean isAnticoagulant;

    RatPoison(String activeIngredient, double concentration, boolean isAnticoagulant) {
        this.activeIngredient = activeIngredient;
        this.concentration = concentration;
        this.isAnticoagulant = isAnticoagulant;
        System.out.println("String, double, boolean param of RatPoison");
    }
}
