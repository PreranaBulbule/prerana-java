package com.xworkz.Runner;
import com.xworkz.override14.Book;
import com.xworkz.override14.BookStore;
import com.xworkz.override14.Novel;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.getTitle();
        book1.getAuthor();
        book1.getPrice();
        book1.getGenre();
        book1.getPageCount();

        System.out.println("-------------------");
        Book book2 = new Novel();
        book2.getTitle();
        book2.getAuthor();
        book2.getPrice();
        book2.getGenre();
        book2.getPageCount();

        System.out.println("-----------------");
        Novel novel = new Novel();
        novel.getTitle();
        novel.getAuthor();
        novel.getPrice();
        novel.getGenre();
        novel.getPageCount();
        novel.getAward();

        System.out.println("------------------");
        BookStore bookStore = new BookStore();
        bookStore.manage(book2);
        bookStore.manage(book1);
        bookStore.manage(novel);
    }
}