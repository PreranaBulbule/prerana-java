package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Calendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar wallCalendar = new Calendar("2025", "Wall Calendar", 15.99);
        System.out.println(wallCalendar);
        System.out.println("Custom hashCode (overridden): " + wallCalendar.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(wallCalendar));

        Calendar cal1 = new Calendar();
        cal1.setYear("2025");

        Calendar cal2 = new Calendar();
        cal2.setYear("2025");

        boolean same = cal1.equals(cal2);
        System.out.println("Both same year: " + same);
    }
}


