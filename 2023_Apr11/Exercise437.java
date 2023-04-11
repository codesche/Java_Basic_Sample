import java.util.ArrayList;

public class Exercise437 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        arrayList.add(1, "INSERTED ELEMENT");
        System.out.println("ArrayList contains...");
        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println(arrayList.get(index));
        }
    }
}
