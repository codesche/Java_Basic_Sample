import java.util.Enumeration;
import java.util.Hashtable;

public class Exercise507 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Object obj = ht.remove("2");
        System.out.println(obj + " Removed from Hashtable");

        Enumeration e = ht.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
