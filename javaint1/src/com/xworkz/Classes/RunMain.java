package com.xworkz.Classes;

public class RunMain {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Brush brush = new Brush();
        Clip clip = new Clip("Red");
        Cricket cricket = new Cricket(ticket);

        Virat virat = new Virat(brush, clip, ticket, cricket);
        virat.play();
        virat.clean();
        virat.relax();
    }
}
