package com.xworkz.override14;

public class Novel extends Book {
    public Novel() {
        super();
        System.out.println("Running non-arg constructor Novel--child");
    }

    @Override
    public void getTitle() {
        System.out.println("Novel title is 'The Great Gatsby'--child");
    }

    @Override
    public void getAuthor() {
        System.out.println("Novel author is F. Scott Fitzgerald--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Novel price is $10--child");
    }

    @Override
    public void getGenre() {
        System.out.println("Novel genre is Fiction--child");
    }

    @Override
    public void getPageCount() {
        System.out.println("Novel page count is 180 pages--child");
    }

    public void getAward() {
        System.out.println("Novel has won multiple awards--child only method");
    }
}