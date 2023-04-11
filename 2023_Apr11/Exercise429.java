import java.util.ArrayList;

public class Exercise429 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Object[] objArray = arrayList.toArray();

        System.out.println("ArrayList elements are copied into an Array. Now Array Contains..");
        for (int index = 0; index < objArray.length; index++) {
            System.out.println(objArray[index]);
        }
    }
}
