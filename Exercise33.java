import java.time.LocalDateTime;

public class Exercise33 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Time: " + LocalDateTime.now());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
