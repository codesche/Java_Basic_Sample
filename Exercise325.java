import java.util.Random;

public class Exercise325 {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((Thread t, Throwable e) -> {
            System.out.println("Woa! there was an exception thrown somewhere! "
            + t.getName() + ": " + e);
        });

        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int divisor = random.nextInt(4);
            System.out.println("200 / " + divisor + " Is " + (200 / divisor));
        }
    }
}
