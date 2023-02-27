import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise42 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        ListIterator<String> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
