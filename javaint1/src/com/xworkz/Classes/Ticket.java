package com.xworkz.Classes;

public class Ticket {
    void type()
    {
        TicketType tickettype =  TicketType.Movie;
        System.out.println("Ticket type:" + tickettype);
    }
    void cost()
    {
        System.out.println("Cost of the ticket");
    }
    void buy()
    {
        System.out.println("Buy the ticket");
    }
    void sell()
    {
        System.out.println("Sell the ticket");
    }
}
