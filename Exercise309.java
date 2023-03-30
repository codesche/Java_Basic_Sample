

public class Exercise309 {
    public static void main(String[] args) {
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                if (i * j > 400) {
                    System.out.println("a");
                    break out;
                }
            }
        }
    }
}
