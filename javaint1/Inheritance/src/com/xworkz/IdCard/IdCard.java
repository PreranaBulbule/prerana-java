package com.xworkz.IdCard;

public class IdCard {
    private String material;
    private String[] colors;
    private double weight;
    private String designedBy;

    public String getMaterial() {
        return material;
    }

    public String[] getColors() {
        return colors;
    }

    public double getWeight() {
        return weight;
    }

    public String getDesignedBy() {
        return designedBy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDesignedBy(String designedBy) {
        this.designedBy = designedBy;
    }

    public void displayDetails() {
        System.out.println("Material: " + material);
        System.out.println("Colors: " + Arrays.toString(colors));
        System.out.println("Weight: " + weight + "g");
        System.out.println("Designed By: " + designedBy);
    }
}
