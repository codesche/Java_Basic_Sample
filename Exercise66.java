import java.util.Arrays;
import java.util.HashSet;

public class Exercise66 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);
    }
}
