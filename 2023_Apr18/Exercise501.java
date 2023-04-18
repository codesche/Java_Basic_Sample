import java.util.HashSet;

public class Exercise501 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();
        System.out.println("Size of HashSet : " + hSet.size());

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        System.out.println("Size of HashSet after addition : " + hSet.size());

        hSet.remove(new Integer("1"));
        System.out.println("Size of HashSet after removal : " + hSet.size());
    }
}
