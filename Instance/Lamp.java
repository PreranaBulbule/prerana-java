class Lamp {

    String brand;
    String type;
    int wattage;
    String color;

    public static final String MESSAGE = "This is a Lamp object.";

    public Lamp(String brand, String type, int wattage, String color) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
        this.color = color;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Type: " + type + 
                           ", Wattage: " + wattage + "W, Color: " + color);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Lamp philips = new Lamp("Philips", "LED", 10, "White");
        Lamp syska = new Lamp("Syska", "Halogen", 50, "Yellow");
        Lamp havells = new Lamp("Havells", "CFL", 15, "Warm White");
        Lamp wipro = new Lamp("Wipro", "Incandescent", 60, "Soft White");
        Lamp bajaj = new Lamp("Bajaj", "LED", 12, "Cool White");
        Lamp eveready = new Lamp("Eveready", "CFL", 20, "Neutral White");
        Lamp panasonic = new Lamp("Panasonic", "Halogen", 40, "Daylight");
        Lamp surya = new Lamp("Surya", "Incandescent", 100, "Soft White");
        Lamp anchor = new Lamp("Anchor", "LED", 7, "Warm Yellow");
        Lamp osram = new Lamp("Osram", "CFL", 18, "Bright White");

        philips.display();
        syska.display();
        havells.display();
        wipro.display();
        bajaj.display();
        eveready.display();
        panasonic.display();
        surya.display();
        anchor.display();
        osram.display();
    }
}