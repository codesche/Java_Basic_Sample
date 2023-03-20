import java.io.IOException;

public class Exercise175 {

    public static String replaceAll(String s, char from, char to) {
        if (s.length() < 1) {
            return s;
        } else {
            char first = (from == s.charAt(0)) ? to : s.charAt(0);
            return first + replaceAll(s.substring(1), from, to);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(replaceAll("apple", 'a', 'b'));
    }
}
