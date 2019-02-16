package com.infoshare.principles;

import java.util.Arrays;

public class KISS {


    public String weekday(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new IllegalArgumentException();
        }
    }

    public String weekday2(int day) {
        if ((day < 1) || (day > 7)) {
            throw new IllegalArgumentException();
        }
        return Arrays.asList(Day.values()).get(day - 1).name();
    }

    private enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
