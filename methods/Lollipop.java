class Lollipop {
    public void createLollipop() {
        System.out.println("Creating a new lollipop...");
    }

    public void addFlavor(String flavor) {
        System.out.println("Adding flavor: " + flavor);
    }

    public void setColor(String color) {
        System.out.println("Setting lollipop color to: " + color);
    }

    public void wrapLollipop() {
        System.out.println("Wrapping the lollipop...");
    }

    public void displayLollipop() {
        System.out.println("Displaying the lollipop...");
    }

     public void makeLollipop() {
        CandyMaker maker = new CandyMaker();
        maker.mixIngredients();
        maker.heatMixture();
        maker.pourIntoMold();
        maker.insertStick();
        maker.coolAndPackage();
    }
}

 class Main {
    public static void main(String[] args) {
        Lollipop lollipop = new Lollipop();
        
       lollipop.createLollipop();
        lollipop.addFlavor("Strawberry");
        lollipop.setColor("Red");
        lollipop.wrapLollipop();
        lollipop.displayLollipop();

        lollipop.makeLollipop();
    }
}

