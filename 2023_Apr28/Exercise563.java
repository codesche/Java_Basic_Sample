

public class Exercise563 {
    public static void main(String[] args) {
        String str = "book2s.com/";
        System.out.println(trimLastSlash(str));
    }

    public static String trimLastSlash(String str) {
        if (str.endsWith("/")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

}
