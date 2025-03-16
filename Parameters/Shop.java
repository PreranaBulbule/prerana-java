class Shop {
    public void sell(String vegetable, int quantity) {
        System.out.println("Shop is selling " + quantity + " kg of " + vegetable);
        Agent agent = new Agent();
        agent.purchase(vegetable, quantity);
    }
}