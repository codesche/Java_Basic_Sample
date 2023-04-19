import java.util.Hashtable;

public class Exercise511 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        boolean blnExists = ht.containsKey("2");
        System.out.println("2 exists in Hashtable ? : " + blnExists);
    }
}
