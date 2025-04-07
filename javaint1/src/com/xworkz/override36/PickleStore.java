package com.xworkz.override36;

public class PickleStore {
    public void manage(Pickle pickle) {
        pickle.getType();
        pickle.getFlavor();
        pickle.getSpiciness();
        pickle.getShelfLife();
        pickle.getPrice();

        if (pickle instanceof MangoPickle) {
            System.out.println("Pickle is instance of MangoPickle");
            MangoPickle mangoPickle = (MangoPickle) pickle;
            mangoPickle.getRegion();
        }
    }

}
