

public class Exercise554 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(trim(str));
    }

    public static String trim(String str) {
        str = str.trim();
        if (str.charAt(0) == ' ') {
            str = str.substring(1, str.length());
        }
        return str;
    }

}
