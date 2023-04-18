import java.util.HashSet;
import java.util.Iterator;

public class Exercise497 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        Iterator itr = hSet.iterator();

        System.out.println("HashSet contains : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
