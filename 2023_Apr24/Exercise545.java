

public class Exercise545 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String sub = "o";
        System.out.println(countOccurrencesOf(str, sub));
    }

    public static int countOccurrencesOf(String str, String sub) {
        if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
            return 0;
        }

        int count = 0;
        int pos = 0;
        int idx;

        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + sub.length();
        }
        return count;
    }

}
