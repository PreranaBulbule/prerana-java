package Software.Intern;

public class HighSchool extends School {
    public HighSchool() {
        super();
        System.out.println("No-args constructor of HighSchool");

        super.enrollStudent();
        System.out.println("Enrolling student in High School");

        super.conductClasses();
        System.out.println("Conducting high school classes");

        super.organizeEvents();
        System.out.println("Organizing High School events");

        super.evaluateStudents();
        System.out.println("Evaluating students in High School");
    }
}
