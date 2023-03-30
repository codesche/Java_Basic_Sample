

public class Exercise314 {
    public static void main(String[] args) {
        try {
            callSomeFunctionThatMightThrow(null);
        } catch (NullPointerException e) {
            System.out.println("There was an null parameter!");
        }
    }

    private static void callSomeFunctionThatMightThrow(Object o) {
        if (o == null) {
            throw new NullPointerException("The object is null");
        }
    }
}
