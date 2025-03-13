class Nucleus {
    private int protons;
    private int neutrons;

    public Nucleus(int protons, int neutrons) {
        this.protons = protons;
        this.neutrons = neutrons;
    }

    public int getProtons() {
        return protons;
    }

    public int getNeutrons() {
        return neutrons;
    }

    public int calculateMassNumber() {
        return protons + neutrons;
    }

    public String determineStability() {
        return (protons <= neutrons) ? "Stable" : "Unstable";
    }

    public double nuclearBindingEnergy() {
        return (protons + neutrons) * 8.0; // Approximate formula
    }
}


