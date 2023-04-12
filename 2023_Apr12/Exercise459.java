import java.util.BitSet;

public class Exercise459 {

    BitSet sked = new BitSet(365);

    public Exercise459() {
        int[] holiday = { 1, 15, 50, 148, 185, 246, 281, 316, 326, 359 };
        for (int i = 0; i < holiday.length; i++) {
            addHoliday(holiday[i]);
        }
    }

    public void addHoliday(int dayToAdd) {
        sked.set(dayToAdd);
    }

    public boolean isHoliday(int dayToCheck) {
        boolean result = sked.get(dayToCheck);
        return result;
    }

    public static void main(String[] args) {
        Exercise459 cal = new Exercise459();

        try {
            int whichDay = 123;
            if (cal.isHoliday(whichDay)) {
                System.out.println("Day number " + whichDay + " is a holiday.");
            } else {
                System.out.println("Day number " + whichDay + " is not a holiday.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe.getMessage());
        }
    }
}
