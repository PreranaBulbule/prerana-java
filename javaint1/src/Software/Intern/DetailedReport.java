package Software.Intern;

public class DetailedReport extends Report {
    public void DR() {
        System.out.println("no-args constructor of detailed report");
    }

    {
        super.generateSummary();
        System.out.println("Generating summary in detailed report");
    }

    {
        super.detailedAnalysis();
        System.out.println("Performing detailed analysis in detailed report");
    }

    {
        super.exportData();
        System.out.println("Exporting data in detailed report");
    }

    {
        super.printReport();
        System.out.println("Printing detailed report");
    }
}