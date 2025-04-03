package Software.Intern;

public class PlasticBucket extends Bucket {
    public PlasticBucket() {
        super();
        System.out.println("No-args constructor of PlasticBucket");

        super.fillBucket();
        System.out.println("Filling a plastic bucket with water");

        super.emptyBucket();
        System.out.println("Emptying the plastic bucket carefully");

        super.cleanBucket();
        System.out.println("Washing the plastic bucket with soap");

        super.storeBucket();
        System.out.println("Storing the plastic bucket properly");
    }
}
