import java.util.Hashtable;

public class Exercise512 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        boolean blnExists = ht.contains("Two");
        System.out.println("Two exists in Hashtable ? : " + blnExists);
    }
}
