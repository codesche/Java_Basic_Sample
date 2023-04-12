import java.util.ArrayList;
import java.util.Iterator;

public class Exercise449 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Iterator itr = arrayList.iterator();

        System.out.println("Iterating through ArrayList elements...");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
