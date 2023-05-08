import java.text.DecimalFormat;

public class Exercise631 {
    public static void main(String[] args) {
        long val = 42;
        int len = 42;
        System.out.println(long2StringRightBlank(val, len));
    }

    public static String long2StringRightBlank(long val, int len) {
        String pattern = "#";
        DecimalFormat fmt = new DecimalFormat(pattern);
        String str = fmt.format(val);
        if (str.length() < len) {
            return str + FillString(' ', len - str.length());
        } else {
            return str.substring(str.length() - len);
        }
    }

    public static String FillString(char val, int len) {
        String str = "";
        for (int i = 0; i < len; i++) {
            str = str + val;
        }
        return str;
    }

}
