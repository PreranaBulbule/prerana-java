class Bar {
    
    double size;       
    long quantity;     
    boolean available; 

    Bar(double size, long quantity, boolean available) {
        this.size = size;
        this.quantity = quantity;
        this.available = available;
        System.out.println("double, long, boolean param of Bar");
    }
}
