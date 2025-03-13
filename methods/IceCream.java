class IceCream {
    private IceCreamFactory factory;  

    public IceCream() {
        this.factory = new IceCreamFactory();
    }

    public void chooseFlavor(String flavor) {
        System.out.println("IceCream: Choosing flavor - " + flavor);
    }

    public void scoop() {
        System.out.println("IceCream: Scooping ice cream into a cone...");
    }

    public void melt() {
        System.out.println("IceCream: Ice cream is melting under the sun...");
    }

    public void serve() {
        System.out.println("IceCream: Serving the ice cream...");
    }

    public void eat() {
        System.out.println("IceCream: Enjoying the delicious ice cream!");
    }


    public void prepareIceCream() {
        factory.mixIngredients();
        factory.freezeMixture();
        factory.addToppings();
        factory.packIceCream();
        factory.distributeToStores();
    }
}

class Main {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream();

        iceCream.chooseFlavor("Chocolate");
        iceCream.scoop();
        iceCream.melt();
        iceCream.serve();
        iceCream.eat();
        iceCream.prepareIceCream();
    }
}
