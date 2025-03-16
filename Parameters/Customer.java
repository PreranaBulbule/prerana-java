 class Customer {
    public void buy(String vegetable, int quantity) {
        System.out.println("Customer wants to buy " + quantity + " kg of " + vegetable);
        Shop shop = new Shop();
        shop.sell(vegetable, quantity);
    }
}