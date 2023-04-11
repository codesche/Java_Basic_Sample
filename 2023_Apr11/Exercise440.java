import java.util.ArrayList;
import java.util.Collections;

public class Exercise440 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println("Before shuffling, ArrayList contains : " + arrayList);

        Collections.shuffle(arrayList);

        System.out.println("After shuffling, ArrayList contains : " + arrayList);
    }
}
