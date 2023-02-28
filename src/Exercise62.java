import java.util.Arrays;
import java.util.HashSet;

public class Exercise62 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);      // 교집합 수행
        System.out.println(intersection);
    }
}
