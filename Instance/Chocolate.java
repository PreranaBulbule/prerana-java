class Chocolate {

    String name;
    String type;
    int weight;
    String origin;

    public static final String MESSAGE = "This is a Chocolate object.";

    public Chocolate(String name, String type, int weight, String origin) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    public void display() {
        System.out.println("Name: " + name + ", Type: " + type +
                           ", Weight: " + weight + "g, Origin: " + origin);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Chocolate dairyMilk = new Chocolate("Dairy Milk", "Milk Chocolate", 100, "UK");
        Chocolate snickers = new Chocolate("Snickers", "Nougat & Peanuts", 50, "USA");
        Chocolate ferreroRocher = new Chocolate("Ferrero Rocher", "Hazelnut Chocolate", 200, "Italy");
        Chocolate twix = new Chocolate("Twix", "Caramel & Biscuit", 80, "USA");
        Chocolate toblerone = new Chocolate("Toblerone", "Milk Chocolate & Honey", 150, "Switzerland");
        Chocolate kitKat = new Chocolate("KitKat", "Wafer Chocolate", 120, "UK");
        Chocolate lindt = new Chocolate("Lindt", "Dark Chocolate", 90, "Switzerland");
        Chocolate galaxy = new Chocolate("Galaxy", "Smooth Milk Chocolate", 110, "UK");
        Chocolate bounty = new Chocolate("Bounty", "Coconut Chocolate", 85, "UK");
        Chocolate hershey = new Chocolate("Hershey's", "Milk Chocolate", 95, "USA");

        dairyMilk.display();
        snickers.display();
        ferreroRocher.display();
        twix.display();
        toblerone.display();
        kitKat.display();
        lindt.display();
        galaxy.display();
        bounty.display();
        hershey.display();
    }
}