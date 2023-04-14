import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise471 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);
    }
}
