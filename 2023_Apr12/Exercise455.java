import java.util.LinkedList;

public class Exercise455 {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Jack");
        officers.add("P");
        officers.add("Tom");
        officers.add(2, "new");
        for (String s : officers) {
            System.out.println(s);
        }
    }
}
