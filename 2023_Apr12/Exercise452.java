import java.util.ArrayList;

public class Exercise452 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        System.out.println("Size of ArrayList before removing elements : " + arrayList.size());

        arrayList.clear();
        System.out.println("Size of ArrayList after removing elements : " + arrayList.size());
    }
}
