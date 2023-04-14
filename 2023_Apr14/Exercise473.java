import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise473 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            list.add("");
        }
        String filter = args[0];
        Collections.fill(list, filter);
        for (String s : list) {
            System.out.printf("%s%n", s);
        }
    }
}
