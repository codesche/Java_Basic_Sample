

public class Exercise647 {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 42;
        System.out.println(createString(ch, count));
    }

    public static String createString(char ch, int count) {
        StringBuilder result = new StringBuilder(count);

        for (int index = 0; index < count; index++) {
            result.append(ch);
        }

        return result.toString();
    }
}
