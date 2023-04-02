

public class Exercise344 {
    public static void main(String[] args) {
        try (Test2 test2 = new Test2()) {
            test2.show();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {

        }
    }
}

class Test2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Connection to this class is automatically closing");
    }

    void show() {
        System.out.println("Show Method is called");
    }
}