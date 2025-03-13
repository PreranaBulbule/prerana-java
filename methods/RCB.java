class RCB {
    private TeamManagement management; 

        public RCB() {
        this.management = new TeamManagement();
    }

        public void playMatch() {
        System.out.println("RCB is playing a thrilling match...");
    }

    public void practiceSession() {
        System.out.println("RCB players are having a rigorous practice session...");
    }

    public void teamMeeting() {
        System.out.println("RCB is conducting a team meeting...");
    }

    public void analyzePerformance() {
        System.out.println("RCB is analyzing previous match performances...");
    }

    public void celebrateVictory() {
        System.out.println("RCB is celebrating their latest victory...");
    }

        public void manageTeamOperations() {
        management.selectPlayers();
        management.planStrategies();
        management.manageSponsorships();
        management.scheduleTraining();
        management.handleMedia();
    }
}

class Main {
    public static void main(String[] args) {
        RCB rcb = new RCB();

        rcb.playMatch();
        rcb.practiceSession();
        rcb.teamMeeting();
        rcb.analyzePerformance();
        rcb.celebrateVictory();

        rcb.manageTeamOperations();
    }
}
