class ICC {
        public void setCricketRules() {
        System.out.println("ICC is setting global cricket rules...");
    }

    public void promoteCricket() {
        System.out.println("ICC is promoting cricket worldwide...");
    }

    public void handleDisputes() {
        System.out.println("ICC is resolving international cricket disputes...");
    }

    public void conductAntiCorruptionChecks() {
        System.out.println("ICC is conducting anti-corruption investigations...");
    }

    public void maintainHallOfFame() {
        System.out.println("ICC is maintaining the Cricket Hall of Fame...");
    }

      public void manageCricketOperations() {
        CricketBoard board = new CricketBoard();
        board.organizeWorldCup();
        board.scheduleMatches();
        board.setPlayerRankings();
        board.manageUmpires();
        board.handleSponsorships();
    }
}

class Main {
    public static void main(String[] args) {
        ICC icc = new ICC();

        icc.setCricketRules();
        icc.promoteCricket();
        icc.handleDisputes();
        icc.conductAntiCorruptionChecks();
        icc.maintainHallOfFame();

               icc.manageCricketOperations();
    }
}
