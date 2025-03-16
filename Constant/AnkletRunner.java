class AnkletRunner {
	
    public static void main(String[] args) {
		
        String material1 = "Gold";
        double length1 = 9.5;
        boolean hasCharms1 = true;
        Anklet anklet1 = new Anklet(material1, length1, hasCharms1);
        System.out.println("Anklet material: " + material1);
        System.out.println("Anklet length: " + length1);
        System.out.println("Has charms: " + hasCharms1);

        String material2 = "Silver";
        double length2 = 10.0;
        boolean hasCharms2 = false;
        Anklet anklet2 = new Anklet(material2, length2, hasCharms2);
        System.out.println("Anklet material: " + material2);
        System.out.println("Anklet length: " + length2);
        System.out.println("Has charms: " + hasCharms2);

        String material3 = "Platinum";
        double length3 = 8.5;
        boolean hasCharms3 = true;
        Anklet anklet3 = new Anklet(material3, length3, hasCharms3);
        System.out.println("Anklet material: " + material3);
        System.out.println("Anklet length: " + length3);
        System.out.println("Has charms: " + hasCharms3);

        String material4 = "Beaded";
        double length4 = 9.0;
        boolean hasCharms4 = false;
        Anklet anklet4 = new Anklet(material4, length4, hasCharms4);
        System.out.println("Anklet material: " + material4);
        System.out.println("Anklet length: " + length4);
        System.out.println("Has charms: " + hasCharms4);

        String material5 = "Leather";
        double length5 = 9.8;
        boolean hasCharms5 = true;
        Anklet anklet5 = new Anklet(material5, length5, hasCharms5);
        System.out.println("Anklet material: " + material5);
        System.out.println("Anklet length: " + length5);
        System.out.println("Has charms: " + hasCharms5);
    }
}