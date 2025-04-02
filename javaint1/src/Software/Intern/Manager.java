package Software.Intern;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("No-args constructor of Manager");

        super.work();
        System.out.println("Manager is overseeing work");

        super.takeBreak();
        System.out.println("Manager is taking a short break");

        super.attendMeeting();
        System.out.println("Manager is leading a meeting");

        super.receiveSalary();
        System.out.println("Manager is approving salaries");
    }
}