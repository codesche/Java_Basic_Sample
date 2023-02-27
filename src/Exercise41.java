import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise41 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        reversedList.forEach(s -> System.out.println(s));

        System.out.println("list: " + list);
        System.out.println("reversedList: " + reversedList);
    }
}
