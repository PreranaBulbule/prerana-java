class Globe {
    private Earth earth;  

    public Globe() {
        this.earth = new Earth();
    }

    public void showContinents() {
        System.out.println("Globe is displaying all continents...");
    }

    public void showOceans() {
        System.out.println("Globe is showing all oceans...");
    }

    public void markCountries() {
        System.out.println("Globe is marking all the countries...");
    }

    public void indicateTimeZones() {
        System.out.println("Globe is indicating different time zones...");
    }

    public void spin() {
        System.out.println("Globe is spinning on its axis...");
    }

    public void demonstrateEarthConcepts() {
        earth.rotate();
        earth.revolveAroundSun();
        earth.experienceSeasons();
        earth.controlTides();
        earth.sustainLife();
    }
}
class Main {
    public static void main(String[] args) {
        Globe globe = new Globe();
        globe.showContinents();
        globe.showOceans();
        globe.markCountries();
        globe.indicateTimeZones();
        globe.spin();
        globe.demonstrateEarthConcepts();
    }
}

