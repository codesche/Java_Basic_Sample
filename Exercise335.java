import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise335 {
    public static void main(String[] args) {

    }
}

class BgThread extends Thread {
    Logger logger = Logger.getLogger("com.mycompany.mypackage");

    BgThread() {
        setDaemon(true);
    }

    // Set to true to shut down this thread
    boolean stop = false;

    public void run() {
        while (!stop) {
            try {
                // Perform work here
            } catch (Throwable t) {
                // Log the exception and continue
                logger.log(Level.SEVERE, "Unexception exception", t);
            }
        }
    }

}
