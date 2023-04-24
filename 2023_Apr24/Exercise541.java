

public class Exercise541 {
    public static void main(String[] args) {
        String string = "book2s.com";
        System.out.println(substringAfterLastDot(string));
    }

    public static String substringAfterLastDot(String string) {
        return getSubstringAfter(string, '.');
    }

    public static String getSubstringAfter(String s, char c) {
        return s.substring(s.lastIndexOf(c) + 1).trim();
    }

}
