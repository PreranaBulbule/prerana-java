class Broker {
    public void brokerage(String vegetable, int quantity) {
        System.out.println("Broker is handling brokerage for " + quantity + " kg of " + vegetable);
        Farmer farmer = new Farmer();
        farmer.farm(vegetable, quantity);
    }
}