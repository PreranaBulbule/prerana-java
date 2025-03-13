class IplCup {
    private IplManagement management; 

    public IplCup() {
        this.management = new IplManagement();
    }

    public void startTournament() {
        System.out.println("IPL Cup tournament is starting...");
    }

    public void announceAwards() {
        System.out.println("IPL Cup is announcing awards for best players...");
    }

    public void organizeFinalMatch() {
        System.out.println("IPL Cup is organizing the final match...");
    }

    public void celebrateWinners() {
        System.out.println("IPL Cup is celebrating the winners...");
    }

    public void closeTournament() {
        System.out.println("IPL Cup tournament is closing with a grand ceremony...");
    }

    public void manageIplOperations() {
        management.scheduleMatches();
        management.handleSponsorships();
        management.organizeOpeningCeremony();
        management.manageUmpires();
        management.handleMediaRights();
    }
}

 class Main {
    public static void main(String[] args) {
        IplCup ipl = new IplCup();

        ipl.startTournament();
        ipl.announceAwards();
        ipl.organizeFinalMatch();
        ipl.celebrateWinners();
        ipl.closeTournament();
        ipl.manageIplOperations();
    }
}
