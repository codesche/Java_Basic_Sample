import java.util.ArrayList;
import java.util.Arrays;

public class Exercise80 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
    }
}
