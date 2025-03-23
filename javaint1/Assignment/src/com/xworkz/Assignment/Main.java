package com.xworkz.Assignment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrimeMinister pm = new PrimeMinister("Modi", 78, "2020-2025", new ArrayList<>());
        Country india = new Country("India", 45, 805000000L, pm);
        india.display();
    }
}

