 class Atom {
    private String element;
    private int electrons;
    private Nucleus nucleus;

    public Atom(String element, int electrons, int protons, int neutrons) {
        this.element = element;
        this.electrons = electrons;
        this.nucleus = new Nucleus(protons, neutrons);
    }

    public String getElement() {
        return element;
    }

    public int getElectronCount() {
        return electrons;
    }

    public boolean isNeutral() {
        return electrons == nucleus.getProtons();
    }

    public String ionize() {
        if (electrons > 0) {
            electrons--;
            return "Atom ionized!";
        }
        return "No more electrons to remove.";
    }

    public String electronConfiguration() {
        return element + " has " + electrons + " electrons.";
    }

    public int getProtons() {
        return nucleus.getProtons();
    }

    public int getNeutrons() {
        return nucleus.getNeutrons();
    }

    public int massNumber() {
        return nucleus.calculateMassNumber();
    }

    public String stability() {
        return nucleus.determineStability();
    }

    public double bindingEnergy() {
        return nucleus.nuclearBindingEnergy();
    }

    public static void main(String[] args) {
        Atom oxygen = new Atom("Oxygen", 8, 8, 8);

        System.out.println(oxygen.getElement());
        System.out.println("Electrons: " + oxygen.getElectronCount());
        System.out.println("Is neutral? " + oxygen.isNeutral());
        System.out.println(oxygen.ionize());
        System.out.println(oxygen.electronConfiguration());

        System.out.println("Protons: " + oxygen.getProtons());
        System.out.println("Neutrons: " + oxygen.getNeutrons());
        System.out.println("Mass Number: " + oxygen.massNumber());
        System.out.println("Stability: " + oxygen.stability());
        System.out.println("Binding Energy: " + oxygen.bindingEnergy());
    }
}

