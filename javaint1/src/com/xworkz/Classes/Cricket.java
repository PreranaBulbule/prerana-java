package com.xworkz.Classes;

public class Cricket {
    Ticket ticket;
    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }
    void watch(Ticket ticket)
    {
        if(ticket!=null)
        {
            ticket.buy();
        }
        else {
            System.out.println("null Exception");
        }
    }
}
