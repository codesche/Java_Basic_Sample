import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise419 {
    public static void main(String[] args) {
        String regex = "[abc]@.";

        String source = "cric@mypkg.com is a valid email address";
        Exercise419.findPattern(regex, source);

        source = "asdf@mypkg.com is invalid";
        Exercise419.findPattern(regex, source);

        source = "a@asdf@fdsa@u";
        Exercise419.findPattern(regex, source);

        source = "There is an @ sign here";
        Exercise419.findPattern(regex, source);
    }

    public static void findPattern(String regex, String source) {
        // Compile regex into a Pattern object
        Pattern p = Pattern.compile(regex);

        // Get a Matcher object
        Matcher m = p.matcher(source);

        boolean found = false;

        // Print regex and source text
        System.out.println("\nRegex:" + regex);
        System.out.println("Text:" + source);

        // Perform find
        while (m.find()) {
            System.out.println("Matched Text:" + m.group() + ", Start:" + m.start() + ", " +
                    "End:" + m.end());

            found = true;
        }

        if (!found) {
            System.out.println("No match found");
        }
    }

}
