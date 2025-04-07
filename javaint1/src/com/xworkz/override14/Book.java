package com.xworkz.override14;

public class Book {
    public Book() {
        System.out.println("Running non-arg constructor Book--parent");
    }

    public void getTitle() {
        System.out.println("Generic title of the book--parent");
    }

    public void getAuthor() {
        System.out.println("Generic author of the book--parent");
    }

    public void getPrice() {
        System.out.println("Generic price of the book--parent");
    }

    public void getGenre() {
        System.out.println("Generic genre of the book--parent");
    }

    public void getPageCount() {
        System.out.println("Generic page count of the book--parent");
    }
}

