import java.util.*;

public class Exercise464 {
    public static void main(String[] args) {
        int size = 0;
        String strings = "java2s.com";
        System.out.println(newRandomStringList(size, strings));
    }

    private static final Random RANDOM = new Random();

    public static Collection<String> newRandomStringList(int size, String... strings) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be less than 0. ");
        }

        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("strings must contains at least one String.");
        }

        List<String> list = new ArrayList<String>(size);

        for (String string : strings) {
            for (int i = 0; i < size / 3; i++) {
                list.add(string);
            }
        }

        if (list.size() < size) {
            for (int i = list.size(); i < size; i++) {
                list.add(strings[i % strings.length]);
            }
        }

        Collections.shuffle(list, RANDOM);

        return list;
    }
}
