import java.util.HashMap;

public class Exercise486 {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();

        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        hMap.clear();

        System.out.println("Total key value pairs in HashMap are : " + hMap.size());
    }
}
