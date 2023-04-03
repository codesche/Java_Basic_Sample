import java.util.Set;
import java.util.TreeSet;

public class Exercise358 {
    public static void main(String[] args) {
        int[] a1 = { 1, 3, 8, 54, 2, 65, 7 };
        int[] a2 = { 3, 7, 1, 5, 8, 90 };

        Set<Integer> set1 = new TreeSet<Integer>();

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    set1.add(a1[i]);
                }
            }
        }

        System.out.println(set1);
        Integer[] arr = set1.toArray(new Integer[set1.size()]);
        System.out.println(arr);
    }
}
