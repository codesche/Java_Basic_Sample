import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise31 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c", "d"));

        String[] arr = set.toArray(new String[0]);
        System.out.println(Arrays.asList(arr));
    }
}
