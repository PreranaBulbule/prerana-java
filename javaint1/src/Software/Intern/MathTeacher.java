package Software.Intern;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("No-args constructor of MathTeacher");

        super.teach();
        System.out.println("Teaching Mathematics");

        super.giveAssignments();
        System.out.println("Giving math assignments");

        super.conductExams();
        System.out.println("Conducting math exams");

        super.evaluateStudents();
        System.out.println("Evaluating students in Mathematics");
    }
}
