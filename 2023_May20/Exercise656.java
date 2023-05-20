import java.util.stream.Stream;

public class Exercise656 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n * n))
                .forEach(System.out::println);
    }
}
