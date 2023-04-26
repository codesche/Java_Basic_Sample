

public class Exercise559 {
    public static void main(String[] args) {
        String s = "book2s.com   ";
        System.out.println(trim(s));
    }

    public static String trim(String s) {
        return trim(s, ' ');
    }

    public static String trim(String s, Character c) {
        return trimLeft(trimRight(s, c), c);
    }

    public static String trimLeft(String s) {
        return trimLeft(s, ' ');
    }

    public static String trimLeft(String s, Character c) {
        final int length = s.length();
        int i = 0;
        while (i < length && s.charAt(i) <= c) {
            ++i;
        }
        return s.substring(i);
    }

    public static String trimRight(String s) {
        return trimRight(s, ' ');
    }

    public static String trimRight(String s, Character c) {
        final int length = s.length();
        int i = length;
        while (i > 0 && s.charAt(i - 1) <= c) {
            --i;
        }
        return s.substring(0, i);
    }

}
