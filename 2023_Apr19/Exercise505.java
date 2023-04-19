import java.util.HashSet;

public class Exercise505 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        System.out.println("HashSet before removal : " + hSet);

        boolean blnRemoved = hSet.remove(new Integer("2"));
        System.out.println("Was 2 removed from HashSet ? " + blnRemoved);

        System.out.println("HashSet after removal : " + hSet);
    }
}
