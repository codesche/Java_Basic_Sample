import java.util.ArrayList;
import java.util.Collections;

public class Exercise443 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("1"));
        arrayList.add(new Integer("8"));
        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("5"));

        Object obj = Collections.max(arrayList);

        System.out.println("Maximum Element of Java ArrayList is : " + obj);
    }
}
