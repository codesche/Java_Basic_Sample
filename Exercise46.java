

public class Exercise46 {
    public static void main(String[] args) {
        while (true) {
            int i = (int) (Math.random() * 6) + 1;
            int j = (int) (Math.random() * 6) + 1;

            if (i + j == 5) {
                System.out.printf("(%d %d)", i, j);
                break;
            }
            System.out.printf("(%d %d)\n", i, j);
        }
    }
}
