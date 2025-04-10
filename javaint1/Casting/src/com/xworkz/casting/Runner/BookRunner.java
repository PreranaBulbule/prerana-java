package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299.99);
        System.out.println(book1);
        System.out.println("Custom hashCode (overridden): " + book1.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(book1));
    }
}
