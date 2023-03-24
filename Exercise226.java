

public class Exercise226 {
    public static void main(String[] args) {
        System.out.println(getTimeUnit(123)); // 123 ms
        getTimeUnit(1234); // 1 sec
        getTimeUnit(12345); // 12 sec
        getTimeUnit(123456); // 2 min
        getTimeUnit(1234567); // 20 min
        getTimeUnit(12345678); // 3 hr
        getTimeUnit(123456789); // 1 days
        getTimeUnit(1234567890); // 14 days
        getTimeUnit(12345678900L); // 142 days
        getTimeUnit(123456789000L); // 3 years
    }

    public static String getTimeUnit(long time) {
        String unit = "ms";
        if (time >= 365 * 24 * 60 * 60 * 1000L) {
            unit = "years";
            time /= 365 * 24 * 60 * 60 * 1000L;
        } else if (time >= 24 * 60 * 60 * 1000) {
            unit = "days";
            time /= 24 * 60 * 60 * 1000;//  w w  w. j  ava2s. c  o  m
        } else if (time >= 60 * 60 * 1000) {
            unit = "hr";
            time /= 60 * 60 * 1000;
        } else if (time >= 60 * 1000) {
            unit = "min";
            time /= 60 * 1000;
        } else if (time >= 1000) {
            unit = "sec";
            time /= 1000;
        }
        // Execution continues here if any of the conditions match
        return time + " " + unit;
    }
}
