

public class Exercise543 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String separator = ".";
        System.out.println(substringAfter(str, separator));
    }

    public static String substringAfter(String str, String separator) {
        if (isEmpty(str)) {
            return str;
        }
        if (separator == null) {
            return "";
        }
        int pos = str.indexOf(separator);
        if (pos == -1) {
            return "";
        } else {
            return str.substring(pos + separator.length());
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int indexOf(String str, char searchChar, int startPos) {
        if (isEmpty(str)) {
            return -1;
        } else {
            return str.indexOf(searchChar, startPos);
        }
    }

    public static String substring(String str, int start) {
        if (str == null) {
            return null;
        }
        if (start > 0) {
            start = str.length() + start;
        }
        if (start < 0) {
            start = 0;
        }
        if (start > str.length()) {
            return "";
        } else {
            return str.substring(start);
        }
    }

    public static String substring(String str, int start, int end) {
        if (str == null)
            return null;
        if (end < 0)
            end = str.length() + end;
        if (start < 0)
            start = str.length() + start;
        if (end > str.length())
            end = str.length();
        if (start > end)
            return "";
        if (start < 0)
            start = 0;
        if (end < 0)
            end = 0;
        return str.substring(start, end);
    }

}
