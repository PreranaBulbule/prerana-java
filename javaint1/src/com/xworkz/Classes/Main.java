            package com.xworkz.Classes;

            public class Main {
                public static void main(String[] args){
                    Ticket ticket = new Ticket();
                    ticket.type();
                    Cricket cricket = new Cricket(ticket);
                    ticket.buy();
                    Profit profit = new Profit(ticket);
                    ticket.sell();
                }
            }
