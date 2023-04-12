import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise450 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        Comparator comparator = Collections.reverseOrder();

        System.out.println("Before sorting ArrayList in descending order : " + arrayList);

        Collections.sort(arrayList, comparator);
        System.out.println("After sorting ArrayList in descending order : " + arrayList);
    }
}
