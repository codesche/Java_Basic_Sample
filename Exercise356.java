import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise356 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> result = new HashSet<>();

        for (Integer el: a) {
            if (!b.contains(el)) {
                result.add(el);
            }
        }

        for (Integer el: b) {
            if (!a.contains(el)) {
                result.add(el);
            }
        }

        System.out.println("Uncommon elements of set a and set b is : " + result);
    }
}
