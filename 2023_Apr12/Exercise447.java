import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Exercise447 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        Enumeration e = Collections.enumeration(arrayList);

        System.out.println("Enumerating through Java ArrayList");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
