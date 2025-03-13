class Powerbank {

    String brand;
    int capacity; 
    int outputPorts;
    String color;

    public static final String MESSAGE = "This is a Powerbank object.";

    public Powerbank(String brand, int capacity, int outputPorts, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.outputPorts = outputPorts;
        this.color = color;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Capacity: " + capacity + "mAh, Output Ports: " + outputPorts + ", Color: " + color);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Powerbank anker = new Powerbank("Anker", 20000, 2, "Black");
        Powerbank mi = new Powerbank("Mi", 10000, 1, "White");
        Powerbank ravPower = new Powerbank("RavPower", 25000, 3, "Blue");
        Powerbank samsung = new Powerbank("Samsung", 15000, 2, "Silver");
        Powerbank duracell = new Powerbank("Duracell", 18000, 2, "Gold");
        Powerbank belkin = new Powerbank("Belkin", 12000, 1, "Black");
        Powerbank romoss = new Powerbank("Romoss", 30000, 4, "Gray");
        Powerbank aukey = new Powerbank("Aukey", 20000, 2, "Red");
        Powerbank ambrane = new Powerbank("Ambrane", 27000, 3, "White");
        Powerbank syska = new Powerbank("Syska", 10000, 1, "Blue");

        anker.display();
        mi.display();
        ravPower.display();
        samsung.display();
        duracell.display();
        belkin.display();
        romoss.display();
        aukey.display();
        ambrane.display();
        syska.display();
    }
}