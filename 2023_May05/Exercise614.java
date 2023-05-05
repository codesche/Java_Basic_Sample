import java.util.stream.Stream;

public class Exercise614 {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 1).map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);
    }
}
