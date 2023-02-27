import java.util.function.Function;

public class Exercise24 {
    public static void main(String[] args) {
        Function<Integer, Double> add = n -> n + 2.0;
        Function<Double, Double> multiply = n -> n * 5.0;
        Function<Integer, Double> addAndMultiply = multiply.compose(add);

        Double result = addAndMultiply.apply(1);
        System.out.println(result);
    }
}
