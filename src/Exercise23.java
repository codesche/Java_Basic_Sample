import java.util.function.Function;

public class Exercise23 {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = n -> n * n;
        Function<Integer, String> func2 = n -> "result: " + n;

        String result = func1.andThen(func2).apply(10);

        System.out.println(result);
    }
}
