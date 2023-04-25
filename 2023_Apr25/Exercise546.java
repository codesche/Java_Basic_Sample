

public class Exercise546 {
    public static void main(String[] args) {
        String str = "book2s.com";
        int length = 2;
        System.out.println(substr(str, length));
    }

    public static String substr(String str, int length) {
        if (str == null) {
            return str;
        }
        if (length < str.length()) {
            return str.substring(0, length);
        }
        return str;
    }

}
