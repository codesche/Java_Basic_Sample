import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Exercise513 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Collection c = ht.values();

        System.out.println("Values of Collection created from Hashtable are : ");

        Iterator itr = c.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        c.remove("One");

        System.out.println("Hashtable values after removal from Collection are :");
        Enumeration e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
