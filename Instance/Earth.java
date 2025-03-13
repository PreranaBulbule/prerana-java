class Earth {

    String continent;
    String country;
    long population;
    String climate;

    public static final String MESSAGE = "This is an Earth object.";

    public Earth(String continent, String country, long population, String climate) {
        this.continent = continent;
        this.country = country;
        this.population = population;
        this.climate = climate;
    }

    public void display() {
        System.out.println("Continent: " + continent + ", Country: " + country +
                           ", Population: " + population + ", Climate: " + climate);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

		
        Earth india = new Earth("Asia", "India", 1400000000, "Tropical");
        Earth usa = new Earth("North America", "USA", 331000000, "Temperate");
        Earth germany = new Earth("Europe", "Germany", 83000000, "Oceanic");
        Earth brazil = new Earth("South America", "Brazil", 212000000, "Tropical");
        Earth nigeria = new Earth("Africa", "Nigeria", 206000000, "Hot Desert");
        Earth china = new Earth("Asia", "China", 1440000000, "Continental");
        Earth france = new Earth("Europe", "France", 67000000, "Mediterranean");
        Earth australia = new Earth("Australia", "Australia", 26000000, "Arid");
        Earth argentina = new Earth("South America", "Argentina", 45000000, "Temperate");
        Earth egypt = new Earth("Africa", "Egypt", 104000000, "Desert");

		
        india.display();
        usa.display();
        germany.display();
        brazil.display();
        nigeria.display();
        china.display();
        france.display();
        australia.display();
        argentina.display();
        egypt.display();
    }
}