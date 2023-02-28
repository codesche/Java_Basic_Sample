import java.util.Arrays;
import java.util.HashSet;

public class Exercise67 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);
    }
}
