package com.xworkz.Runner;
import com.xworkz.override31.Calendar;
import com.xworkz.override31.CalendarStore;
import com.xworkz.override31.WallCalendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar1 = new Calendar();
        calendar1.getYear();
        calendar1.getMonth();
        calendar1.getDay();
        calendar1.getType();
        calendar1.getPrice();

        System.out.println("-------------------");
        Calendar calendar2 = new WallCalendar();
        calendar2.getYear();
        calendar2.getMonth();
        calendar2.getDay();
        calendar2.getType();
        calendar2.getPrice();

        System.out.println("-----------------");
        WallCalendar wallCalendar = new WallCalendar();
        wallCalendar.getYear();
        wallCalendar.getMonth();
        wallCalendar.getDay();
        wallCalendar.getType();
        wallCalendar.getPrice();
        wallCalendar.getDesign();

        System.out.println("------------------");
        CalendarStore calendarStore = new CalendarStore();
        calendarStore.manage(calendar2);
        calendarStore.manage(calendar1);
        calendarStore.manage(wallCalendar);
    }
}