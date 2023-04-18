import java.util.HashSet;

public class Exercise499 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        System.out.println("HashSet before removal : " + hSet);
        hSet.clear();
        System.out.println("HashSet after removal : " + hSet);
        System.out.println("Is HashSet empty ? " + hSet.isEmpty());
    }
}
