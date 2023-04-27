import java.util.regex.Pattern;

public class Exercise564 {
    public static void main(String[] args) {
        String str = "/book2s.com";
        System.out.println(trimFirstSlash(str));
    }

    public static String trimFirstSlash(String str) {
        if (str.startsWith("/")) {
            return str.replaceFirst(Pattern.quote("/"), "");
        }
        return str;
    }

}
