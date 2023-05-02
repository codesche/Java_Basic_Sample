

public class Exercise597 {
    public static void main(String[] args) {
        String string = "b  oo  k2s.com";
        System.out.println(replaceWhitespaces(string));
    }

    public static String replaceWhitespaces(String string) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (Character.isWhitespace(c)) {
                builder.setCharAt(i, '_');
            }
        }
        return builder.toString();
    }

}
