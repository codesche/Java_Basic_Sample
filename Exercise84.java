

public class Exercise84 {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i += 1;
        }
        System.out.println(result);
    }
}
