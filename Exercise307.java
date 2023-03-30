

public class Exercise307 {
    public static void main(String[] args) {
        for (int number = 2; number <= 20; number++) {
            if (number == 12) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
