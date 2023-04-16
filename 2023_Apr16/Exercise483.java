import java.util.HashMap;

public class Exercise483 {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();

        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        boolean blnExists = hMap.containsValue("Two");
        System.out.println("Two exists in HashMap ? : " + blnExists);
    }
}
