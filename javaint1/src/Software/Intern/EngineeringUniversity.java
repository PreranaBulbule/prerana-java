package Software.Intern;

public class EngineeringUniversity extends University {
    public EngineeringUniversity() {
        super();
        System.out.println("No-args constructor of EngineeringUniversity");

        super.admitStudent();
        System.out.println("Admitting student to Engineering University");

        super.conductLectures();
        System.out.println("Conducting technical lectures in Engineering University");

        super.organizeConvocation();
        System.out.println("Organizing convocation for Engineering students");

        super.provideResearchFacilities();
        System.out.println("Providing specialized engineering research facilities");
    }
}