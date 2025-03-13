class Metro {

    String city;
    int metroLines;
    double ticketPrice;
    boolean isOperational;
    
    public static final String METRO_SERVICE = "Metro Transport Service";

    public Metro(String city, int metroLines, double ticketPrice, boolean isOperational) {
        this.city = city;
        this.metroLines = metroLines;
        this.ticketPrice = ticketPrice;
        this.isOperational = isOperational;
    }

    public void displayDetails(String objectName) {
        System.out.println("Object Name: " + objectName);
        System.out.println("Metro City: " + city);
        System.out.println("Number of Metro Lines: " + metroLines);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Is Operational: " + isOperational);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to " + METRO_SERVICE);
        System.out.println("**************");

        Metro bangloreMetro = new Metro("Banglore", 24, 2.75, true);
        Metro delhiMetro = new Metro("DelhiMetro", 11, 3.50, true);
        Metro mumbaiMetro = new Metro("Mumbai", 13, 2.00, true);
        Metro rajajinagarMetro = new Metro("Rajajinagar", 16, 1.90, true);
        Metro magadiMetro = new Metro("Magadi", 10, 2.80, true);
        Metro puneMetro = new Metro("Pune", 10, 0.50, true);
        Metro dubaiMetro = new Metro("Dubai", 2, 1.75, true);
        Metro majesticMetro = new Metro("Majestic", 12, 1.60, true);
        Metro krpuramMetro = new Metro("Krpuram", 19, 0.70, true);
        Metro vijaynagarMetro = new Metro("Vijaynagar", 6, 1.75, true);

        bangloreMetro.displayDetails("bangloreMetro");
        delhiMetro.displayDetails("delhiMetro");
        mumbaiMetro.displayDetails("mumbaiMetro");
        rajajinagarMetro.displayDetails("rajajinagarMetro");
        magadiMetro.displayDetails("magadiMetro");
        puneMetro.displayDetails("puneMetro");
        dubaiMetro.displayDetails("dubaiMetro");
        majesticMetro.displayDetails("majesticMetro");
        krpuramMetro.displayDetails("krpuramMetro");
        vijaynagarMetro.displayDetails("vijaynagarMetro");
    }
}