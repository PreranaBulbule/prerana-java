class Book {
    Book() {
        System.out.println("Book object created.");
    }
}

class Pen {
    Pen() {
        System.out.println("Pen object created.");
    }
}

class Laptop {
    Laptop() {
        System.out.println("Laptop object created.");
    }
}

class Chair {
    Chair() {
        System.out.println("Chair object created.");
    }
}

class Mobile {
    Mobile() {
        System.out.println("Mobile object created.");
    }
}

 class Study{
    public static void main(String[] args) {
      
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();
        Pen pen4 = new Pen();
        Pen pen5 = new Pen();

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        Laptop laptop4 = new Laptop();
        Laptop laptop5 = new Laptop();

        Chair chair1 = new Chair();
        Chair chair2 = new Chair();
        Chair chair3 = new Chair();
        Chair chair4 = new Chair();
        Chair chair5 = new Chair();

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();
        Mobile mobile3 = new Mobile();
        Mobile mobile4 = new Mobile();
        Mobile mobile5 = new Mobile();

        System.out.println("Total 25 instances created successfully.");
    }
}