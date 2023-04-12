import java.util.ArrayList;
import java.util.List;

public class Exercise444 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        List list = arrayList.subList(1, 3);

        System.out.println("Sub list contains : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Object obj = list.remove(0);
        System.out.println(obj + " is removed from sub list ");

        System.out.println("After removing " + obj + " from sub list, original ArrayList contains : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
