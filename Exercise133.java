

public class Exercise133 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
            total += sum;
        }
        System.out.println(total);
    }
}
