import java.util.ArrayList;
import java.util.Arrays;

public class Exercise423 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("cat");
        al.add("dog");
        al.add("rat");

        System.out.println("ArrayList:" + al);

        String[] s1 = new String[al.size()];
        String[] s2 = al.toArray(s1);

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));

        s1 = new String[1];
        s1[0] = "hello";

        s2 = al.toArray(s1);

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s1:" + Arrays.toString(s2));
    }
}
