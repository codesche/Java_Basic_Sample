import java.text.DecimalFormat;

public class Exercise630 {
    public static void main(String[] args) {
        long val = 42;
        int len = 4;
        System.out.println(long2StringLeftZero(val, len));
    }

    public static String long2StringLeftZero(long val, int len) {
        String pattern = "";
        for (int i = 0; i < len; i++) {
            pattern += '0';
        }

        DecimalFormat fmt = new DecimalFormat(pattern);
        return fmt.format(val);
    }

}
