class Train {

    String name;
    String type;
    int capacity;
    String route;

    public static final String MESSAGE = "This is a Train object.";

    public Train(String name, String type, int capacity, String route) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.route = route;
    }

    public void display() {
        System.out.println("Name: " + name + ", Type: " + type + 
                           ", Capacity: " + capacity + " passengers, Route: " + route);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Train bulletTrain = new Train("Shinkansen", "High-Speed", 1300, "Tokyo - Osaka");
        Train euroStar = new Train("Eurostar", "High-Speed", 900, "London - Paris");
        Train amtrak = new Train("Amtrak Acela", "Express", 300, "Boston - Washington");
        Train rajdhani = new Train("Rajdhani Express", "Superfast", 1400, "Delhi - Mumbai");
        Train tgv = new Train("TGV", "High-Speed", 1200, "Paris - Lyon");
        Train maglev = new Train("Maglev", "Magnetic Levitation", 1000, "Shanghai - Pudong");
        Train ice = new Train("ICE", "High-Speed", 850, "Berlin - Munich");
        Train metro = new Train("NYC Subway", "Metro", 1200, "Manhattan - Brooklyn");
        Train orientExpress = new Train("Orient Express", "Luxury", 500, "Paris - Istanbul");
        Train vandeBharat = new Train("Vande Bharat", "Semi-High-Speed", 1100, "Delhi - Varanasi");

        bulletTrain.display();
        euroStar.display();
        amtrak.display();
        rajdhani.display();
        tgv.display();
        maglev.display();
        ice.display();
        metro.display();
        orientExpress.display();
        vandeBharat.display();
    }
}