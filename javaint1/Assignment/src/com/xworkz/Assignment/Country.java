package com.xworkz.Assignment;

public class Country {
    String name;
    int age;
    long population;
    PrimeMinister primeMinister;

    public Country(String name, int age, long population, PrimeMinister primeMinister) {
        this.name = name;
        this.age = age;
        this.population = population;
        this.primeMinister = primeMinister;
    }


    public void display() {
        System.out.println("Country: " + name + " | Age: " + age + " | Population: " + population);
        primeMinister.display();
    }

    static class Details {
        String description;

        public Details(String description) {
            this.description = description;
        }

        public void display() {
            System.out.println("Detail: " + description);
        }
    }
}
