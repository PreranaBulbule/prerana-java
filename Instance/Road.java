class Road {

    String name;
    String type;
    int length; 
    String location;

    public static final String MESSAGE = "This is a Road object.";

    public Road(String name, String type, int length, String location) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.location = location;
    }

    public void display() {
        System.out.println("Name: " + name + ", Type: " + type + 
                           ", Length: " + length + " km, Location: " + location);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Road highway66 = new Road("Route 66", "Highway", 3945, "USA");
        Road autobahn = new Road("Autobahn", "Expressway", 13000, "Germany");
        Road goldenQuadrilateral = new Road("Golden Quadrilateral", "National Highway", 5846, "India");
        Road greatOceanRoad = new Road("Great Ocean Road", "Coastal Road", 243, "Australia");
        Road transSiberian = new Road("Trans-Siberian Highway", "Longest Road", 11000, "Russia");
        Road panAmerican = new Road("Pan-American Highway", "Intercontinental", 30000, "North & South America");
        Road silkRoad = new Road("Silk Road", "Historical Trade Route", 6500, "China to Europe");
        Road gardenRoute = new Road("Garden Route", "Scenic Route", 300, "South Africa");
        Road pacificCoast = new Road("Pacific Coast Highway", "Scenic Road", 1055, "USA");
        Road nileCorniche = new Road("Nile Corniche", "Urban Road", 50, "Egypt");

        highway66.display();
        autobahn.display();
        goldenQuadrilateral.display();
        greatOceanRoad.display();
        transSiberian.display();
        panAmerican.display();
        silkRoad.display();
        gardenRoute.display();
        pacificCoast.display();
        nileCorniche.display();
    }
}