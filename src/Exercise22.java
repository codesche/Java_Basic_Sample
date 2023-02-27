import java.util.function.Function;

public class Exercise22 {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = x -> x * x;
        Integer result = func1.apply(10);
        System.out.println(result);
    }
}
