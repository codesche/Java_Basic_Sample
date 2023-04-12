import java.util.ArrayList;
import java.util.Collections;

public class Exercise448 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("ArrayList Contains : " + arrayList);

        Collections.replaceAll(arrayList, "A", "Replace All");

        System.out.println("After Replace All, ArrayList Contains : " + arrayList);
    }
}
