

public class Exercise645 {
    public static void main(String[] args) {
        int count = 42;
        char character = 'a';
        System.out.println(getRepeatingString(count, character));
    }

    public static String getRepeatingString(int count, char character) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(character);
        }
        return result.toString();
    }

}
