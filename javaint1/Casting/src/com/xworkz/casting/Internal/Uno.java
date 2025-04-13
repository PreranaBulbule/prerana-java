package com.xworkz.casting.Internal;

public class Uno {
    private String gameType;
    private String cardColor;
    private double price;

    public Uno(String gameType, String cardColor, double price) {
        this.gameType = gameType;
        this.cardColor = cardColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Uno{gameType='" + gameType + "', cardColor='" + cardColor + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Uno HashCode: " + super.hashCode());
        return 67890; // Custom hashCode value
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Uno) {
                System.out.println("Comparing Uno objects...");
                Uno uno1 = this;
                Uno uno2 = (Uno) obj;
                if (uno1.gameType.equals(uno2.gameType) &&
                        uno1.cardColor.equals(uno2.cardColor) &&
                        uno1.price == uno2.price) {
                    System.out.println("Both Uno games are identical.");
                    return true;
                }
            }
        }
        return false;
    }
}
