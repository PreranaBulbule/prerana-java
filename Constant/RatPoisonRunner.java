class RatPoisonRunner {
	
    public static void main(String[] args) {
		
        String ingredient1 = "Brodifacoum";
        double concentration1 = 0.005;
        boolean isAnticoagulant1 = true;
        RatPoison poison1 = new RatPoison(ingredient1, concentration1, isAnticoagulant1);
        System.out.println("RatPoison active ingredient: " + ingredient1);
        System.out.println("RatPoison concentration: " + concentration1);
        System.out.println("Is anticoagulant: " + isAnticoagulant1);

        String ingredient2 = "Bromethalin";
        double concentration2 = 0.01;
        boolean isAnticoagulant2 = false;
        RatPoison poison2 = new RatPoison(ingredient2, concentration2, isAnticoagulant2);
        System.out.println("RatPoison active ingredient: " + ingredient2);
        System.out.println("RatPoison concentration: " + concentration2);
        System.out.println("Is anticoagulant: " + isAnticoagulant2);

        String ingredient3 = "Warfarin";
        double concentration3 = 0.025;
        boolean isAnticoagulant3 = true;
        RatPoison poison3 = new RatPoison(ingredient3, concentration3, isAnticoagulant3);
        System.out.println("RatPoison active ingredient: " + ingredient3);
        System.out.println("RatPoison concentration: " + concentration3);
        System.out.println("Is anticoagulant: " + isAnticoagulant3);

        String ingredient4 = "Cholecalciferol";
        double concentration4 = 0.015;
        boolean isAnticoagulant4 = false;
        RatPoison poison4 = new RatPoison(ingredient4, concentration4, isAnticoagulant4);
        System.out.println("RatPoison active ingredient: " + ingredient4);
        System.out.println("RatPoison concentration: " + concentration4);
        System.out.println("Is anticoagulant: " + isAnticoagulant4);

        String ingredient5 = "Diphacinone";
        double concentration5 = 0.005;
        boolean isAnticoagulant5 = true;
        RatPoison poison5 = new RatPoison(ingredient5, concentration5, isAnticoagulant5);
        System.out.println("RatPoison active ingredient: " + ingredient5);
        System.out.println("RatPoison concentration: " + concentration5);
        System.out.println("Is anticoagulant: " + isAnticoagulant5);
    }
}