import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise613 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = numbers.stream().iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            System.out.println(n);
        }
    }
}
