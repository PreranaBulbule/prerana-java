class MagnetRunner {
	
    public static void main(String[] args) {
		
        String type1 = "Neodymium";
        double strength1 = 1.4;
        boolean isElectromagnetic1 = false;
        Magnet magnet1 = new Magnet(type1, strength1, isElectromagnetic1);
        System.out.println("Magnet type: " + type1);
        System.out.println("Magnet strength: " + strength1);
        System.out.println("Is electromagnetic: " + isElectromagnetic1);

        String type2 = "Ferrite";
        double strength2 = 0.5;
        boolean isElectromagnetic2 = false;
        Magnet magnet2 = new Magnet(type2, strength2, isElectromagnetic2);
        System.out.println("Magnet type: " + type2);
        System.out.println("Magnet strength: " + strength2);
        System.out.println("Is electromagnetic: " + isElectromagnetic2);

        String type3 = "Alnico";
        double strength3 = 1.0;
        boolean isElectromagnetic3 = false;
        Magnet magnet3 = new Magnet(type3, strength3, isElectromagnetic3);
        System.out.println("Magnet type: " + type3);
        System.out.println("Magnet strength: " + strength3);
        System.out.println("Is electromagnetic: " + isElectromagnetic3);

        String type4 = "Samarium Cobalt";
        double strength4 = 1.1;
        boolean isElectromagnetic4 = false;
        Magnet magnet4 = new Magnet(type4, strength4, isElectromagnetic4);
        System.out.println("Magnet type: " + type4);
        System.out.println("Magnet strength: " + strength4);
        System.out.println("Is electromagnetic: " + isElectromagnetic4);

        String type5 = "Electromagnet";
        double strength5 = 2.5;
        boolean isElectromagnetic5 = true;
        Magnet magnet5 = new Magnet(type5, strength5, isElectromagnetic5);
        System.out.println("Magnet type: " + type5);
        System.out.println("Magnet strength: " + strength5);
        System.out.println("Is electromagnetic: " + isElectromagnetic5);
    }
}