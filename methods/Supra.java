class Supra {
    private CarFeatures features; 

    public Supra() {
        this.features = new CarFeatures();
    }

    public void startEngine() {
        System.out.println("Supra: Engine started with a roar!");
    }

    public void accelerate() {
        System.out.println("Supra: Accelerating to high speed...");
    }

    public void drift() {
        System.out.println("Supra: Performing a drift around the corner!");
    }

    public void brake() {
        System.out.println("Supra: Braking smoothly...");
    }

    public void showTopSpeed() {
        System.out.println("Supra: Displaying top speed on dashboard...");
    }

    public void activatePerformanceFeatures() {
        features.enableTurbo();
        features.activateABS();
        features.applyLaunchControl();
        features.adjustAerodynamics();
        features.displayFuelEfficiency();
    }
}
 class Main {
    public static void main(String[] args) {
        Supra supra = new Supra();
        supra.startEngine();
        supra.accelerate();
        supra.drift();
        supra.brake();
        supra.showTopSpeed();
        supra.activatePerformanceFeatures();
    }
}
