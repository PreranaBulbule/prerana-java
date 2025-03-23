package com.xworkz.Assignment;
import com.xworkz.Assignment.Portfolio;
import java.util.List;

public class Minister {
    String name;
    int yearsInOffice;
    PersonnalAssistant assistant;
    List<Portfolio> portfolios;
    House house;
    Security security;
    List<State> states;

    public Minister(String name, int yearsInOffice, PersonnalAssistant assistant, List<Portfolio> portfolios, House house, Security security, List<State> states) {
        this.name = name;
        this.yearsInOffice = yearsInOffice;
        this.assistant = assistant;
        this.portfolios = portfolios;
        this.house = house;
        this.security = security;
        this.states = states;
    }

    public void display() {
        System.out.println("    Minister: " + name + " | Years in Office: " + yearsInOffice);
        assistant.display();

        for (Portfolio portfolio : portfolios) {
            portfolio.display();
        }

        house.display();
        security.display();

        for (State state : states) {
            state.display();
        }
    }
}
