

public class Exercise531 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String separtor = "book2s.com";
        System.out.println(substringAfterLast(str, separtor));
    }

    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;

    public static String substringAfterLast(String str, String separator) {
        if (isEmpty(str)) {
            return str;
        }

        if (isEmpty(separator)) {
            return EMPTY;
        }

        int pos = str.lastIndexOf(separator);
        if (pos == INDEX_NOT_FOUND || pos == (str.length() - separator.length())) {
            return EMPTY;
        }

        return str.substring(pos + separator.length());
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

}
