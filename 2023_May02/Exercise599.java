import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise599 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(replaceBlank(str));
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\\\s*|\\t|\\r|\\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

}
