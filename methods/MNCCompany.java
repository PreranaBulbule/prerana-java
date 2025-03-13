class MNCCompany {
    public void developSoftware() {
        System.out.println("MNC is developing software products...");
    }

    public void manageProjects() {
        System.out.println("MNC is managing multiple projects...");
    }

    public void conductMeetings() {
        System.out.println("MNC is conducting business meetings...");
    }

    public void expandBusiness() {
        System.out.println("MNC is expanding its global reach...");
    }

    public void handleClients() {
        System.out.println("MNC is handling international clients...");
    }

    public void manageHR() {
        HRDepartment hr = new HRDepartment();
        hr.conductInterview();
        hr.processPayroll();
        hr.approveLeaves();
        hr.organizeTraining();
        hr.handleEmployeeRelations();
    }
}

class Main {
    public static void main(String[] args) {
        MNCCompany company = new MNCCompany();

         company.developSoftware();
        company.manageProjects();
        company.conductMeetings();
        company.expandBusiness();
        company.handleClients();

          company.manageHR();
    }
}