class Agent {
    public void purchase(String vegetable, int quantity) {
        System.out.println("Agent is purchasing " + quantity + " kg of " + vegetable);
        Broker broker = new Broker();
        broker.brokerage(vegetable, quantity);
    }
}