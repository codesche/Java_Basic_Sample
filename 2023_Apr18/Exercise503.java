import java.util.Collections;
import java.util.HashSet;

public class Exercise503 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Long("91111111111"));
        hashSet.add(new Long("4"));
        hashSet.add(new Long("2"));
        hashSet.add(new Long("2"));
        hashSet.add(new Long("3"));

        Object obj = Collections.min(hashSet);

        System.out.println("Minimum Element of Java HashSet is : " + obj);
    }
}
