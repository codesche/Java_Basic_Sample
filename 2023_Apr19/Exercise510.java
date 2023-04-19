import java.util.Hashtable;

public class Exercise510 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        System.out.println("Size of Hashtable : " + ht.size());

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        System.out.println("Size of Hashtable after addition : " + ht.size());

        Object obj = ht.remove("2");
        System.out.println("Size of Hashtable after removal : " + ht.size());
    }
}
