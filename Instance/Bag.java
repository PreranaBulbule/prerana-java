class Bag {

    String name;
    String color;
    int capacity; 
    double price; 

    static final String CATEGORY = "Luggage & Bags";

    Bag(String name, String color, int capacity, double price) {
        this.name = name;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name + ", Color: " + color + ", Capacity: " + capacity + "L, Price: $" + price);
    }

    public static void main(String[] args) {

        System.out.println("Category: " + CATEGORY + " - Displaying bag details:");

        Bag schoolBag = new Bag("School Bag", "Blue", 15, 30.99);
        Bag travelBag = new Bag("Travel Bag", "Black", 40, 75.50);
        Bag officeBag = new Bag("Office Bag", "Brown", 10, 50.00);
        Bag gymBag = new Bag("Gym Bag", "Red", 20, 35.99);
        Bag picnicBag = new Bag("Picnic Bag", "Green", 25, 45.25);
        Bag laptopBag = new Bag("Laptop Bag", "Grey", 12, 60.75);
        Bag duffleBag = new Bag("Duffle Bag", "Navy", 35, 80.30);
        Bag handbag = new Bag("Handbag", "Pink", 8, 55.60);
        Bag messengerBag = new Bag("Messenger Bag", "Black", 14, 40.99);
        Bag trolleyBag = new Bag("Trolley Bag", "Silver", 50, 120.99);

        Bag[] bags = {schoolBag, travelBag, officeBag, gymBag, picnicBag, 
                      laptopBag, duffleBag, handbag, messengerBag, trolleyBag};

        for (Bag bag : bags) {
            bag.display();
        }
    }
}