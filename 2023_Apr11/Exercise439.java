import java.util.ArrayList;
import java.util.Collections;

public class Exercise439 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println("Before swaping, ArrayList contains : " + arrayList);

        Collections.swap(arrayList, 0, 4);

        System.out.println("After swaping, ArrayList contains : " + arrayList);
    }
}
