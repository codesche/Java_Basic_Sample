import java.util.ArrayList;
import java.util.List;

public class Exercise422 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();

        nameList.add("A");
        nameList.add("B");
        nameList.add("C");

        int count = nameList.size();

        System.out.println("List of names...");
        for (int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }

        nameList.remove("Kathleen");
        count = nameList.size();

        for (int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }
    }
}
