import java.util.ArrayList;

public class Exercise430 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        int totalElements = arrayList.size();

        for (int index = 0; index < totalElements; index++) {
            System.out.println(arrayList.get(index));
        }
    }
}
