import java.util.HashMap;
import java.util.Scanner;

 class Resort {
    private static final HashMap<String, String> phoneBook = new HashMap<>();
    private static final HashMap<String, String> companyToOwner = new HashMap<>();
    private static final HashMap<String, Double> foodMenu = new HashMap<>();
	private static final HashMap<String, Double> accountBalances = new HashMap<>();
	private static final HashMap<String, Double> travelFares = new HashMap<>();
	private static final HashMap<String, String> nameToAlive = new HashMap<>();

	static{

        phoneBook.put("9876543210", "prerana");
        phoneBook.put("8765432109", "bulbule");
        phoneBook.put("7654321098", "sadanand");
        phoneBook.put("6543210987", "varsha");
        phoneBook.put("5432109876", "sushmitha");
        phoneBook.put("4321098765", "nisarga");
        phoneBook.put("3210987654", "sandya");
        phoneBook.put("2109876543", "priyanka");
        phoneBook.put("1098765432", "deeksha");
        phoneBook.put("9988776655", "hiranmayi");
        phoneBook.put("8877665544", "raghu");
        phoneBook.put("7766554433", "pandu");
        phoneBook.put("6655443322", "yashu");
        phoneBook.put("5544332211", "manthu");
        phoneBook.put("4433221100", "geetha");
        phoneBook.put("3322110099", "shwetha");
        phoneBook.put("2211009988", "srini");
        phoneBook.put("1100998877", "pruthvi");
        phoneBook.put("9090909090", "navana");
        phoneBook.put("8080808080", "tanya");
        phoneBook.put("7070707070", "swathi");
        phoneBook.put("6060606060", "sumana");
        phoneBook.put("5050505050", "prathima");

        companyToOwner.put("Apple", "Tim Cook");
        companyToOwner.put("Microsoft", "Satya Nadella");
        companyToOwner.put("Amazon", "Jeff Bezos");
        companyToOwner.put("Tesla", "Elon Musk");
        companyToOwner.put("Google", "Sundar Pichai");
        companyToOwner.put("Facebook", "Mark Zuckerberg");
        companyToOwner.put("Alibaba", "Jack Ma");
        companyToOwner.put("Reliance", "Mukesh Ambani");
        companyToOwner.put("Tata", "Ratan Tata");
        companyToOwner.put("Berkshire Hathaway", "Warren Buffett");
        companyToOwner.put("SpaceX", "Elon Musk");
        companyToOwner.put("Netflix", "Reed Hastings");
		
		foodMenu.put("Burger", 9.09);
        foodMenu.put("Pizza", 29.9);
        foodMenu.put("Pasta", 1.49);
        foodMenu.put("Salad", 5.9);
        foodMenu.put("Sandwich", 5.0);
        foodMenu.put("Fries", 9.9);
        foodMenu.put("Sushi", 39.9);
        foodMenu.put("Bun", 3.5);
        foodMenu.put("Pani Puri", 4.0);
        foodMenu.put("Chicken Wings", 1.99);
        foodMenu.put("Ice Cream", 2.5);
        foodMenu.put("Milkshake", 5.0);
        foodMenu.put("golgappa", 2.0);
        foodMenu.put("Pancakes",3.90);
        foodMenu.put("Coffee", 2.90);
        foodMenu.put("Tea", 1.50);
        foodMenu.put("Smoothie", 3.55);
        foodMenu.put("gobi", 5.0);
        foodMenu.put("kabab",15.0);
		
		accountBalances.put("ACC123456", 1500.75);
        accountBalances.put("ACC234567", 2500.00);
        accountBalances.put("ACC345678", 3200.50);
        accountBalances.put("ACC456789", 980.25);
        accountBalances.put("ACC567890", 4500.00);
        accountBalances.put("ACC678901", 670.90);
        accountBalances.put("ACC789012", 8900.45);
        accountBalances.put("ACC890123", 1200.00);
        accountBalances.put("ACC901234", 5600.30);
        accountBalances.put("ACC012345", 780.75);
        accountBalances.put("ACC112233", 9900.99);
        accountBalances.put("ACC223344", 3400.20);
        accountBalances.put("ACC334455", 290.99);
        accountBalances.put("ACC445566", 1570.65);
        accountBalances.put("ACC556677", 876.40);
        accountBalances.put("ACC667788", 4320.00);
        accountBalances.put("ACC778899", 300.50);
		
		travelFares.put("New York", 120.50);
        travelFares.put("Los Angeles", 250.75);
        travelFares.put("Chicago", 180.30);
        travelFares.put("Banglore", 200.90);
        travelFares.put("Delhi", 275.40);
        travelFares.put("Goa", 195.60);
        travelFares.put("Shimoga", 160.00);
        travelFares.put("Singapur", 220.25);
        travelFares.put("Manali", 245.99);
        travelFares.put("Munnar", 190.75);
        travelFares.put("Dandeli", 210.50);
        travelFares.put("Maldives", 230.80);
        travelFares.put("Maleshia", 175.30);
        travelFares.put("Shimbla", 185.99);
        travelFares.put("Dubai", 260.20);
        travelFares.put("Kerala", 205.55);
        travelFares.put("Waynad", 170.45);
        travelFares.put("Lakswadeep", 195.00);
        travelFares.put("Mumbai", 182.75);
        travelFares.put("Australia", 215.90);
		
		nameToAlive.put("prerana", "Alive");
        nameToAlive.put("Peter", "Alive");
        nameToAlive.put("Dolphin", "Alive");
        nameToAlive.put("Elephant", "Alive");
        nameToAlive.put("Honey", "Alive");
        nameToAlive.put("Kushi", "Alive");
        nameToAlive.put("Krish", "Alive");
        nameToAlive.put("Pintu", "Alive");
    }

    public static String getNameByMobile(String mobile) {
        return phoneBook.getOrDefault(mobile, "Unknown");
    }

    public static String getOwnerByCompany(String company) {
        return companyToOwner.getOrDefault(company, "Owner not found");
    }

    public static String getFoodPrice(String foodItem) {
        Double price = foodMenu.get(foodItem);
        return (price != null) ? String.format("$%.2f", price) : "Item not available";
	}
	
	public static String getAccountBalance(String accountNumber) {
        Double balance = accountBalances.get(accountNumber);
        return (balance != null) ? String.format("Balance: $%.2f", balance) : "Account not found";
    }
	
	public static String getTravelFare(String source) {
        Double fare = travelFares.get(source);
        return (fare != null) ? String.format("Travel Fare: $%.2f", fare) : "Source not available";
    }
	
	public static String getAliveStatus(String name) {
        return nameToAlive.getOrDefault(name, "Not Alive");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.println("Owner: " + getNameByMobile(mobileNumber));

        System.out.print("Enter a company name: ");
        String companyName = scanner.nextLine();
        System.out.println("Company Owner: " + getOwnerByCompany(companyName));

        System.out.print("Enter a food item: ");
        String foodItem = scanner.nextLine();
        System.out.println("Food Price: " + getFoodPrice(foodItem));
		
		System.out.print("Enter an account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println(getAccountBalance(accountNumber));
		
		System.out.print("Enter a source location: ");
        String sourceLocation = scanner.nextLine();
        System.out.println(getTravelFare(sourceLocation));
		
		System.out.print("Enter a name: ");
        String inputName = scanner.nextLine();
        System.out.println("Alive Status: " + getAliveStatus(inputName));

        scanner.close();
    }
}