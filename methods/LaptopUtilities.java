class LaptopUtilities {
    public void connectToWiFi(String networkName) {
        System.out.println("Connected to WiFi: " + networkName);
    }

    public void checkForUpdates() {
        System.out.println("Checking for system updates...");
    }

    public void cleanTemporaryFiles() {
        System.out.println("Cleaning temporary files...");
    }

    public void optimizePerformance() {
        System.out.println("Optimizing laptop performance...");
    }

    public void displayLaptopInfo(Laptop laptop) {
        System.out.println("Displaying information for " + laptop.getBrand() + " laptop.");
    }
}