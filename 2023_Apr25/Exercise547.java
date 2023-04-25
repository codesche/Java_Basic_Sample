

public class Exercise547 {
    public static void main(String[] args) {
        String str1 = "book2s.com";
        String str2 = "o";
        System.out.println(countStr(str1, str2));
    }

    public static int countStr(String str1, String str2) {
        int counter = 0;
        if (str1.indexOf(str2) == -1) {
            return 0;
        } else if (str1.indexOf(str2) != -1) {
            counter++;
            counter += countStr(str1.substring(str1.indexOf(str2) + str2.length()), str2);
            return counter;
        }
        return 0;
    }

}
