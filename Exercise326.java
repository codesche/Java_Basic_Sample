

public class Exercise326 {
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(
            (Thread t, Throwable e) -> {
                System.out.println("In this thread " + t.getName()
                + " an exception was thrown " + e);
        });

        Thread someThread = new Thread(() -> {
            System.out.println(200 / 0);
        });
        someThread.setName("Some Unlucky Thread");
        someThread.start();

        System.out.println("In the main thread " + (200 / 0));
    }
}
