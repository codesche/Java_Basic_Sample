

public class Exercise343 {
    public static void main(String[] args) {
        try (Test test = new Test();) {
            test.show();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {

        }
    }
}


class Test implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Connection to this class is automatically closing");
    }

    void show() {
        System.out.println("Show Method is called");
    }
}
