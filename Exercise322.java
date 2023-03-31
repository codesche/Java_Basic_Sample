import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exercise322 {
    static Lock myLock = new ReentrantLock();
    static Random random = new Random();

    public static void main(String[] args) {
        myLock.lock();
        try {
            int number = random.nextInt(5);
            int result = 100 / number;
            System.out.println("A result is " + result);
            try (FileOutputStream file = new FileOutputStream("file.out")) {
                file.write(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }
}
