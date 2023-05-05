

public class Exercise611 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String stripChars = "com";
        System.out.println(stripEnd(str, stripChars));
    }

    public static final int INDEX_NOT_FOUND = -1;

    public static String stripEnd(String str, String stripChars) {
        int end;
        if (str == null || (end = str.length()) == 0) {
            return str;
        }

        if (stripChars == null) {
            while ((end != 0)
                && Character.isWhitespace(str.charAt(end - 1))) {
                end--;
            }
        } else if (stripChars.length() == 0) {
            return str;
        } else {
            while ((end != 0)
                && (stripChars.indexOf(str.charAt(end - 1)) != INDEX_NOT_FOUND)) {
                end--;
            }
        }
        return str.substring(0, end);
    }

}
