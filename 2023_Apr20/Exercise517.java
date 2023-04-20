import java.util.*;

public class Exercise517 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("This");
        list.add("is");
        list.add("Unmodifiable Collection");

        System.out.println("Element added to list: " + list.get(2));
        Collection<String> immutableCol = Collections.unmodifiableCollection(list);

        Iterator<String> iterator = immutableCol.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
