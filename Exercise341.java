

public class Exercise341 {
    public static void main(String[] args) {
        try (FirstAutoCloseableResource resource1 = new FirstAutoCloseableResource();
                SecondAutoCloseableResource resource2 = new SecondAutoCloseableResource()) {
            resource1.manipulateResource();
            resource2.manipulateResource();
        } catch (Exception e) {
            e.printStackTrace();
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println(throwable);
            }
        }
    }
}

class SecondAutoCloseableResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        // Close the resource as appropriate
        System.out.println("SecondAutoCloseableResource close method executed");
        throw new UnsupportedOperationException(
                "A problem has occurred in SecondAutoCloseableResource");
    }

    public void manipulateResource() {
        // Perform some resource specific operation
        System.out.println("SecondAutoCloseableResource manipulateResource method executed");
    }
}

class FirstAutoCloseableResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        // Close the resource as appropriate
        System.out.println("FirstAutoCloseableResource close method executed");
        throw new UnsupportedOperationException(
                "A problem has occured in FirstAutoCloseableResource");
    }

    public void manipulateResource() {
        // Perform some resource specific operation
        System.out.println("FirstAutoCloseableResource manipulateResource method executed");
    }

}