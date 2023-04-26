

public class Exercise560 {
    public static void main(String[] args) {
        String s = "book2s.com";
        System.out.println(trimLeft(s));
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

}
