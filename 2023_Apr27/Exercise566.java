

public class Exercise566 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(trimAllWhitespace(str));
    }

    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuffer buf = new StringBuffer(str);
        int index = 0;
        while (buf.length() > index) {
            if (Character.isWhitespace(buf.charAt(index))) {
                buf.deleteCharAt(index);
            } else {
                index++;
            }
        }
        return buf.toString();
    }

    public static boolean hasLength(String str) {
        return (str != null && str.length() > 0);
    }

}
