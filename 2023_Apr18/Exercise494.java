import java.util.*;

public class Exercise494 {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> values) {
        Set<String> set = new HashSet<>();

        System.out.printf("%nNonduplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }
}
