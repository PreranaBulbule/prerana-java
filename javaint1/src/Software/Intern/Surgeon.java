package Software.Intern;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
        System.out.println("No-args constructor of Surgeon");

        super.diagnosePatient();
        System.out.println("Surgeon is diagnosing a patient for surgery");

        super.prescribeMedicine();
        System.out.println("Surgeon is prescribing pre-surgery medication");

        super.conductCheckup();
        System.out.println("Surgeon is conducting a surgical checkup");

        super.provideTreatment();
        System.out.println("Surgeon is performing surgery");
    }
}
