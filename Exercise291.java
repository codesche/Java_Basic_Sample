import java.util.LinkedList;

public class Exercise291 {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("Blake");
        officers.add("Bates");
        officers.add("Jack");
        officers.add("Tom");
        officers.add("Lady");
        officers.add("Lady");
        officers.add(2, "new");
        for (String s : officers) {
            System.out.println(s);
        }
    }
}
