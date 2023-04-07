

import java.util.EnumSet;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Exercise396 {
    public static void main(String[] args) {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        print(allDays, "All days: ");

        EnumSet<Day> weekDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        print(weekDays, "Weekdays: ");

        EnumSet<Day> weekends = EnumSet.complementOf(weekDays);
        print(weekends, "Weekends: ");
    }

    public static void print(EnumSet<Day> days, String msg) {
        System.out.println(msg);
        for (Day d : days) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

}
