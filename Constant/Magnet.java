class Magnet {

    String type;
    double strength;
    boolean isElectromagnetic;

    Magnet(String type, double strength, boolean isElectromagnetic) {
        this.type = type;
        this.strength = strength;
        this.isElectromagnetic = isElectromagnetic;
        System.out.println("String, double, boolean param of Magnet");
    }
}
