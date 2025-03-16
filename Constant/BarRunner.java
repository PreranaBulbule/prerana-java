class BarRunner {
	
    public static void main(String[] args) {
		
        double size1 = 12.5;
        long quantity1 = 100L;
        boolean available1 = true;
        Bar bar1 = new Bar(size1, quantity1, available1);
        System.out.println("Bar size: " + size1);
        System.out.println("Bar quantity: " + quantity1);
        System.out.println("Bar available: " + available1);

        double size2 = 15.8;
        long quantity2 = 250L;
        boolean available2 = false;
        Bar bar2 = new Bar(size2, quantity2, available2);
        System.out.println("Bar size: " + size2);
        System.out.println("Bar quantity: " + quantity2);
        System.out.println("Bar available: " + available2);

        double size3 = 20.3;
        long quantity3 = 500L;
        boolean available3 = true;
        Bar bar3 = new Bar(size3, quantity3, available3);
        System.out.println("Bar size: " + size3);
        System.out.println("Bar quantity: " + quantity3);
        System.out.println("Bar available: " + available3);

        double size4 = 30.6;
        long quantity4 = 1000L;
        boolean available4 = false;
        Bar bar4 = new Bar(size4, quantity4, available4);
        System.out.println("Bar size: " + size4);
        System.out.println("Bar quantity: " + quantity4);
        System.out.println("Bar available: " + available4);

        double size5 = 50.2;
        long quantity5 = 1500L;
        boolean available5 = true;
        Bar bar5 = new Bar(size5, quantity5, available5);
        System.out.println("Bar size: " + size5);
        System.out.println("Bar quantity: " + quantity5);
        System.out.println("Bar available: " + available5);
    }
}