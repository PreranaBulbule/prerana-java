package com.xworkz.casting.Internal;

public class Uber {
    private String carModel;
    private String carColor;
    private double fare;

    public Uber(String carModel, String carColor, double fare) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Uber{carModel='" + carModel + "', carColor='" + carColor + "', fare=" + fare + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Uber HashCode: " + super.hashCode());
        return 12345; // Custom hashCode value
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Uber) {
                System.out.println("Comparing Uber objects...");
                Uber uber1 = this;
                Uber uber2 = (Uber) obj;
                if (uber1.carModel.equals(uber2.carModel) &&
                        uber1.carColor.equals(uber2.carColor) &&
                        uber1.fare == uber2.fare) {
                    System.out.println("Both Ubers are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}
