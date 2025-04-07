package com.xworkz.override14;

public class BookStore {
    public void manage(Book book) {
        book.getTitle();
        book.getAuthor();
        book.getPrice();
        book.getGenre();
        book.getPageCount();

        if (book instanceof Novel) {
            System.out.println("Book is instance of Novel");
            Novel novel = (Novel) book;
            novel.getAward();
        }
    }
}

