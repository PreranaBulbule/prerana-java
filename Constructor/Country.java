class Country {
    public static void main(String[] args) {
        java.util.Set<String> countries = new java.util.HashSet<>();
        countries.add("India");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("China");

        printCountriesEndingWithA(countries);
    }

    public static void printCountriesEndingWithA(java.util.Set<String> countries) {
        for (String country : countries) {
            if (country.endsWith("a") || country.endsWith("A")) {
                System.out.println(country);
            }
        }
    }
}