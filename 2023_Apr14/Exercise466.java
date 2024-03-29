import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise466 {
    public static void main(String[] args) {
        List<Time> list = new ArrayList<>();

        list.add(new Time(6, 24, 34));
        list.add(new Time(18, 14, 58));
        list.add(new Time(16, 15, 34));
        list.add(new Time(12, 14, 58));
        list.add(new Time(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", list);

        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}


class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int h) {
        this(h, 0, 0);
    }

    public Time(int h, int m) {
        this(h, m, 0);
    }

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    public Time(Time time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    }

    public void setSecond(int s) {
        if (s >= 0 && s < 60) {
            second = ((s >= 0 && s < 60) ? s : 0);
        } else {
            throw new IllegalArgumentException("second must be 0-59");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

}


class TimeComparator implements java.util.Comparator<Time> {
    @Override
    public int compare(Time time1, Time time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();

        if (minuteDifference != 0) {
            return minuteDifference;
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}














