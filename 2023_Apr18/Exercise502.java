import java.util.Collections;
import java.util.HashSet;

public class Exercise502 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Long("9"));
        hashSet.add(new Long("4"));
        hashSet.add(new Long("2"));
        hashSet.add(new Long("2"));
        hashSet.add(new Long("3"));
        Object obj = Collections.max(hashSet);

        System.out.println("Maximum Element of Java HashSet is : " + obj);
    }
}
