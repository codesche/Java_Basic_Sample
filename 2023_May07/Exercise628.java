import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise628 {
    public static void main(String[] args) {
        String str = "2019-11-10";
        String separator = "-";
        System.out.println(str2calendar(str, separator));
    }

    public static Calendar str2calendar(String str, String separator) {
        if (isEmpty(str)) {
            return null;
        }

        String[] strList = str.split(separator);
        if (strList.length != 3 || !isNumber(strList[0])
            || !isNumber(strList[1]) || !isNumber(strList[2])) {
            return null;
        }

        int year = Integer.parseInt(strList[0]);
        int month = Integer.parseInt(strList[1]);
        int day = Integer.parseInt(strList[2]);
        Calendar result = Calendar.getInstance();
        result.set(year, month - 1, day);
        return result;
    }

    public static boolean isEmpty(CharSequence s) {
        return s == null || s.length() == 0;
    }

    public static boolean isNumber(String numStr) {
        if (isEmpty(numStr)) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher match = pattern.matcher(numStr);
        return match.matches();
    }

}
