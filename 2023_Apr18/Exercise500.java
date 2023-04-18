import java.util.HashSet;

public class Exercise500 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();
        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        System.out.println("HashSet contains.." + hSet);
    }
}
