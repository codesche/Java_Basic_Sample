

public class Exercise294 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numbers[i] + " ");
        }
    }
}
