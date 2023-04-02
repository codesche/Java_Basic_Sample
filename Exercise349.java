

public class Exercise349 {
    public static void main(String[] args) {
        boolean enabled = false;
        assert enabled = true;
        if (enabled) {
            System.out.println("Assertion is enabled.");
        } else {
            System.out.println("Assertion is disabled.");
        }
    }
}
