

public class Exercise601 {
    public static void main(String[] args) {
        String str = "book2s.com";
        int idx = 2;
        char replacement = 'a';
        System.out.println(replaceCharAtIdx(str, idx, replacement));
    }

    public static String replaceCharAtIdx(String str, int idx, char replacement) {
        char array[] = str.toCharArray();
        array[idx] = replacement;
        str = new String(array);
        return str;
    }
}
