import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise79 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());     // 역순으로 정렬
        System.out.println(myList);
    }
}
