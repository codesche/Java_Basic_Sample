

public class Exercise552 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String separator = "book2s.com";
        System.out.println(substringBeforeLast(str, separator));
    }

    public static final String EMPTY_STRING = "";

    public static String substringBeforeLast(String str, String separator) {
        if ((str == null) || (separator == null) || (str.length() == 0)
                || (separator.length() == 0)) {
            return str;
        }

        int pos = str.lastIndexOf(separator);

        if (pos == -1) {
            return str;
        }

        return str.substring(0, pos);
    }
}
