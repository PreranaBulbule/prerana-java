class Flag {

    String country;
    String color;
    int stripes;
    String symbol;

    public static final String MESSAGE = "This is a Flag object.";

    public Flag(String country, String color, int stripes, String symbol) {
        this.country = country;
        this.color = color;
        this.stripes = stripes;
        this.symbol = symbol;
    }

    public void display() {
        System.out.println("Country: " + country + ", Color: " + color + 
                           ", Stripes: " + stripes + ", Symbol: " + symbol);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Flag usa = new Flag("USA", "Red, White, Blue", 13, "Stars and Stripes");
        Flag india = new Flag("India", "Saffron, White, Green", 3, "Ashoka Chakra");
        Flag canada = new Flag("Canada", "Red, White", 2, "Maple Leaf");
        Flag brazil = new Flag("Brazil", "Green, Yellow, Blue", 0, "Globe and Stars");
        Flag japan = new Flag("Japan", "White, Red", 0, "Red Sun");
        Flag germany = new Flag("Germany", "Black, Red, Yellow", 3, "No Symbol");
        Flag france = new Flag("France", "Blue, White, Red", 3, "No Symbol");
        Flag uk = new Flag("United Kingdom", "Red, White, Blue", 0, "Union Jack");
        Flag china = new Flag("China", "Red, Yellow", 0, "Five Stars");
        Flag southKorea = new Flag("South Korea", "White, Black, Red, Blue", 0, "Yin-Yang & Trigrams");

        usa.display();
        india.display();
        canada.display();
        brazil.display();
        japan.display();
        germany.display();
        france.display();
        uk.display();
        china.display();
        southKorea.display();
    }
}