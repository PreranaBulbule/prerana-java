 class Industry {

    private String name;
    private String type;
    private String country;
    private double revenue;

    public static final String INDUSTRY_CATEGORY = "Technology Industry";

    public Industry(String name, String type, String country, double revenue) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.revenue = revenue;
    }

    public void printDetails() {
        System.out.println("Industry Name: " + name);
        System.out.println("Industry Type: " + type);
        System.out.println("Country: " + country);
        System.out.println("Revenue: $" + revenue + " Billion");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Industry Category: " + INDUSTRY_CATEGORY);
        System.out.println("==========================");

        Industry apple = new Industry("Apple", "Technology", "USA", 365.82);
        Industry microsoft = new Industry("Microsoft", "Technology", "USA", 168.09);
        Industry samsung = new Industry("Samsung", "Electronics", "South Korea", 211.87);
        Industry google = new Industry("Google", "Technology", "USA", 282.11);
        Industry amazon = new Industry("Amazon", "E-commerce", "USA", 469.8);
        Industry huawei = new Industry("Huawei", "Telecom", "China", 122.99);
        Industry sony = new Industry("Sony", "Entertainment", "Japan", 83.53);
        Industry tesla = new Industry("Tesla", "Automobile", "USA", 53.85);
        Industry intel = new Industry("Intel", "Semiconductors", "USA", 78.92);
        Industry nvidia = new Industry("Nvidia", "AI & Chips", "USA", 27.43);

        apple.printDetails();
        microsoft.printDetails();
        samsung.printDetails();
        google.printDetails();
        amazon.printDetails();
        huawei.printDetails();
        sony.printDetails();
        tesla.printDetails();
        intel.printDetails();
        nvidia.printDetails();
    }
}