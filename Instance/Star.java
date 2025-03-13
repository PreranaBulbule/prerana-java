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
        System.out.println("---------------------------------------");

        Metro newYorkMetro = new Metro("New York", 24, 2.75, true);
        Metro londonMetro = new Metro("London", 11, 3.50, true);
        Metro tokyoMetro = new Metro("Tokyo", 13, 2.00, true);
        Metro parisMetro = new Metro("Paris", 16, 1.90, true);
        Metro berlinMetro = new Metro("Berlin", 10, 2.80, true);
        Metro delhiMetro = new Metro("Delhi", 10, 0.50, true);
        Metro dubaiMetro = new Metro("Dubai", 2, 1.75, true);
        Metro moscowMetro = new Metro("Moscow", 12, 1.60, true);
        Metro beijingMetro = new Metro("Beijing", 19, 0.70, true);
        Metro losAngelesMetro = new Metro("Los Angeles", 6, 1.75, true);

        newYorkMetro.displayDetails("newYorkMetro");
        londonMetro.displayDetails("londonMetro");
        tokyoMetro.displayDetails("tokyoMetro");
        parisMetro.displayDetails("parisMetro");
        berlinMetro.displayDetails("berlinMetro");
        delhiMetro.displayDetails("delhiMetro");
        dubaiMetro.displayDetails("dubaiMetro");
        moscowMetro.displayDetails("moscowMetro");
        beijingMetro.displayDetails("beijingMetro");
        losAngelesMetro.displayDetails("losAngelesMetro");
    }
}