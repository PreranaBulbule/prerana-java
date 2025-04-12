package com.xworkz.casting.Internal;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        System.out.println("Running no-arg constructor of Book");
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("BookHashCode (from super): " + super.hashCode());
        return 555;  // Custom constant for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Book) {
                System.out.println("have ref. will compare..");
                Book book1 = this;
                Book book2 = (Book) obj;
                if (book1.title.equals(book2.title)) {
                    System.out.println("both are same title");
                    return true;
                }
            }
        }
        return false;
    }
}
