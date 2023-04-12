import java.util.ArrayList;
import java.util.Collections;

public class Exercise445 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");

        System.out.println("Before replacement, ArrayList contains : " + arrayList);

        Collections.fill(arrayList, "REPLACED");

        System.out.println("After replacement, ArrayList contains : " + arrayList);
    }
}
