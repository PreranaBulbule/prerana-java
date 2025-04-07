package com.xworkz.override31;

public class CalendarStore {
    public void manage(Calendar calendar) {
        calendar.getYear();
        calendar.getMonth();
        calendar.getDay();
        calendar.getType();
        calendar.getPrice();

        if (calendar instanceof WallCalendar) {
            System.out.println("Calendar is instance of WallCalendar");
            WallCalendar wallCalendar = (WallCalendar) calendar;
            wallCalendar.getDesign();
        }
    }

}
