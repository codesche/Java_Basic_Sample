import java.util.ArrayList;
import java.util.Arrays;

public class Exercise441 {
    public static void main(String[] args) {
        ArrayList<String> aListDays = new ArrayList<String>();
        aListDays.add("Sunday");
        aListDays.add("Monday");
        aListDays.add("Tuesday");

        Object[] objDays = aListDays.toArray();

        String[] strDays = Arrays.copyOf(objDays, objDays.length, String[].class);

        System.out.println("ArrayList converted to String array");

        for (int i = 0; i < strDays.length; i++) {
            System.out.println(strDays[i]);
        }
    }
}
