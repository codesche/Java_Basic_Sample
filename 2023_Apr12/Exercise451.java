import java.util.ArrayList;
import java.util.Vector;

public class Exercise451 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        Vector v = new Vector();
        v.add("4");
        v.add("5");

        arrayList.addAll(v);

        System.out.println(arrayList);
    }
}
