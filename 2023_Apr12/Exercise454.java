import java.util.ArrayList;
import java.util.Iterator;

public class Exercise454 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");

        String s;
        Iterator e = nums.iterator();
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }
    }
}
