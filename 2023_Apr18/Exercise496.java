import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Exercise496 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");

        Enumeration e = Collections.enumeration(hashSet);

        System.out.println("Enumerating through Java HashSet");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
