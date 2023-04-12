import java.util.ArrayList;

public class Exercise446 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        Object obj = arrayList.remove(1);
        System.out.println(obj + " is removed from ArrayList ");

        System.out.println("ArrayList contains...");
        System.out.println(arrayList);
    }
}
