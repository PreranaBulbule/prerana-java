package com.xworkz.casting.Internal;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("BookHashCode (from super): " + super.hashCode());
        return 555;
    }
}
