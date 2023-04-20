import java.util.Hashtable;

public class Exercise515 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put("One", new Integer(1));
        ht.put("Two", new Integer(2));

        Object obj = ht.get("One");
        System.out.println(obj);
    }
}
