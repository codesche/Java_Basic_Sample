

public class Exercise648 {
    public static void main(String[] args) {
        String stringToRepeat = "book2s.com";
        int repetitions = 42;
        System.out.println(repeater(stringToRepeat, repetitions));
    }

    public static String repeater(String stringToRepeat, int repetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            result.append(stringToRepeat);
        }
        return result.toString();
    }

}
