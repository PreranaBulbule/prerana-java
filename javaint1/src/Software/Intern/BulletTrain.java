package Software.Intern;

public class BulletTrain extends Train {
    public BulletTrain() {
        super();
        System.out.println("No-args constructor of BulletTrain");

        super.startTrain();
        System.out.println("Starting the bullet train with high acceleration");

        super.runTrain();
        System.out.println("Bullet train is running at high speed");

        super.stopTrain();
        System.out.println("Stopping the bullet train smoothly at the platform");

        super.parkTrain();
        System.out.println("Parking the bullet train at the maintenance yard");
    }
}