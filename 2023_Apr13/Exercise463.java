import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Exercise463 {
    public static void main(String[] args) {
        int size = 2;
        System.out.println(newRandomIntegerList(size));
    }

    private static final Random RANDOM = new Random();

    public static Collection<Integer> newRandomIntegerList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException(
                    "Size cannot be less than 0. ");
        }

        Collection<Integer> integers = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            integers.add(RANDOM.nextInt());
        }

        return integers;
    }
}
