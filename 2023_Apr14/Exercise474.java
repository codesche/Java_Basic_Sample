import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise474 {
    public static void main(String[] args) {
        List list = Collections.nCopies(5, "A");
        System.out.println("List contains, ");
        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
        }
    }
}
