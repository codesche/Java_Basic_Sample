import java.util.ArrayList;
import java.util.Collections;

public class Exercise442 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // Add elements to Arraylist
        arrayList.add(new Integer("327482"));
        arrayList.add(new Integer("13408"));
        arrayList.add(new Integer("802348"));
        arrayList.add(new Integer("345308"));
        arrayList.add(new Integer("509324"));

        Object obj = Collections.min(arrayList);

        System.out.println("Minimum Element of Java ArrayList is : " + obj);
    }
}
