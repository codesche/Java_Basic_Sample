import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 역순으로 순회
public class Exercise40 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        for (int i = list.size() - 1; i > -1; i--) {
            System.out.println(list.get(i));
        }
    }
}
