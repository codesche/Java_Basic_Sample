import java.util.HashSet;

public class Exercise504 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet();

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));

        Object[] objArray = hSet.toArray();

        for (int index = 0; index < objArray.length; index++) {
            System.out.println(objArray[index]);
        }
    }
}
