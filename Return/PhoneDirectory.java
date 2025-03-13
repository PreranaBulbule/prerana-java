public class MobileNumberLookup {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("9876543210", "Alice");
        phoneBook.put("8765432109", "Bob");
        phoneBook.put("7654321098", "Charlie");
        phoneBook.put("6543210987", "David");
        phoneBook.put("5432109876", "Emma");
        phoneBook.put("4321098765", "Frank");
        phoneBook.put("3210987654", "Grace");
        phoneBook.put("2109876543", "Hannah");
        phoneBook.put("1098765432", "Ian");
        phoneBook.put("9988776655", "Jack");
        phoneBook.put("8877665544", "Kevin");
        phoneBook.put("7766554433", "Lily");
        phoneBook.put("6655443322", "Mike");
        phoneBook.put("5544332211", "Nancy");
        phoneBook.put("4433221100", "Oliver");
        phoneBook.put("3322110099", "Peter");
        phoneBook.put("2211009988", "Quinn");
        phoneBook.put("1100998877", "Rachel");
        phoneBook.put("9090909090", "Steve");
        phoneBook.put("8080808080", "Tina");
        phoneBook.put("7070707070", "Uma");
        phoneBook.put("6060606060", "Victor");
        phoneBook.put("5050505050", "Wendy");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (phoneBook.containsKey(mobileNumber)) {
            System.out.println("Name: " + phoneBook.get(mobileNumber));
        } else {
            System.out.println("Mobile number not found.");
        }

        scanner.close();
    }
}