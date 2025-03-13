class Bullet {

    String type;
    String caliber;
    double weight;
    String material;

    public static final String MESSAGE = "This is a Bullet object.";

    public Bullet(String type, String caliber, double weight, String material) {
        this.type = type;
        this.caliber = caliber;
        this.weight = weight;
        this.material = material;
    }

    public void display() {
        System.out.println("Type: " + type + ", Caliber: " + caliber +
                           ", Weight: " + weight + "g, Material: " + material);
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE); 

        Bullet hollowPoint = new Bullet("Hollow Point", "9mm", 7.5, "Lead");
        Bullet fullMetalJacket = new Bullet("Full Metal Jacket", "5.56mm", 4.0, "Copper");
        Bullet armorPiercing = new Bullet("Armor Piercing", "7.62mm", 9.5, "Steel Core");
        Bullet tracer = new Bullet("Tracer", "5.56mm", 4.2, "Phosphor-Coated");
        Bullet rubberBullet = new Bullet("Rubber Bullet", "12 Gauge", 15.0, "Rubber");
        Bullet shotgunSlug = new Bullet("Shotgun Slug", "12 Gauge", 30.0, "Lead");
        Bullet incendiary = new Bullet("Incendiary", "7.62mm", 9.0, "Magnesium");
        Bullet frangible = new Bullet("Frangible", ".45 ACP", 6.5, "Compressed Copper");
        Bullet subsonic = new Bullet("Subsonic", ".300 Blackout", 12.5, "Lead Core");
        Bullet explosive = new Bullet("Explosive", "50 BMG", 42.0, "High-Explosive");

        hollowPoint.display();
        fullMetalJacket.display();
        armorPiercing.display();
        tracer.display();
        rubberBullet.display();
        shotgunSlug.display();
        incendiary.display();
        frangible.display();
        subsonic.display();
        explosive.display();
    }
}