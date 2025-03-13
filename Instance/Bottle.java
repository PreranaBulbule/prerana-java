class Bottle {

    String brand;
    String material;
    int capacity; 
    String color;

    public static final String MESSAGE = "This is a Bottle object.";

    public Bottle(String brand, String material, int capacity, String color) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Material: " + material + 
                           ", Capacity: " + capacity + "ml, Color: " + color);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Bottle aquafina = new Bottle("Aquafina", "Plastic", 1000, "Clear");
        Bottle bisleri = new Bottle("Bisleri", "Plastic", 500, "Green");
        Bottle kinley = new Bottle("Kinley", "Glass", 750, "Transparent");
        Bottle evian = new Bottle("Evian", "Plastic", 1500, "Blue");
        Bottle fiji = new Bottle("Fiji", "Glass", 1000, "Transparent");
        Bottle smartWater = new Bottle("SmartWater", "Plastic", 700, "Clear");
        Bottle nestlePureLife = new Bottle("Nestle Pure Life", "Plastic", 500, "Blue");
        Bottle voss = new Bottle("Voss", "Glass", 800, "Transparent");
        Bottle himalaya = new Bottle("Himalaya", "Plastic", 1000, "White");
        Bottle lifeWtr = new Bottle("LifeWTR", "Plastic", 750, "Black");

        aquafina.display();
        bisleri.display();
        kinley.display();
        evian.display();
        fiji.display();
        smartWater.display();
        nestlePureLife.display();
        voss.display();
        himalaya.display();
        lifeWtr.display();
    }
}