import java.util.Enumeration;
import java.util.Hashtable;

public class Exercise514 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
