

public class Exercise635 {
    public static void main(String[] args) {
        String str = "book2s.com";
        int size = 42;
        System.out.println(leftPad(str, size));
    }

    private static final String SPACE = " ";

    public static String leftPad(String str, int size) {
        return leftPad(str, size, SPACE);
    }

    public static String leftPad(String str, int size, String delim) {
        size = (size - str.length()) / delim.length();

        if (size > 0) {
            str = repeat(delim, size) + str;
        }

        return str;
    }

    public static String repeat(String str, int repeat) {
        StringBuffer buffer = new StringBuffer(repeat * str.length());

        for (int i = 0; i < repeat; i++) {
            buffer.append(str);
        }

        return buffer.toString();
    }

}
