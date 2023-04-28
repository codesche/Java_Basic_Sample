

public class Exercise561 {
    public static void main(String[] args) {
        String s = "book2s.com  ";
        System.out.println(trimRight(s));
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
