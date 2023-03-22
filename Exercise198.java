

public class Exercise198 {
    public static void main(String[] args) {
        int i = 110;//  w  w  w  .j a v  a 2s  .com
        float f = 120.2F;
        byte b = 5;
        String str = "Hello";
        boolean b1 = true;

        i += 10; // Assigns 120 to i

        i -= 15; // Assigns 95 to i. Assuming i was 110
        i *= 2; // Assigns 220 to i. Assuming i was 110
        i /= 2; // Assigns 55 to i. Assuming i was 110
        i /= 0; // A runtime error . Division by zero error
        f /= 0.0; // Assigns Float.POSITIVE_INFINITY to f
        i %= 3; // Assigns 2 to i. Assuming i is 110

        str += " How are you?"; // Assigns "Hello How are you?" to str
        str += f; // Assigns "Hello120.2" to str. Assuming str was "Hello"
        b += f; // Assigns 125 to b. Assuming b was 5, f was 120.2
        str += b1; // Assigns "Hellotrue" to str. Assuming str was "Hello"

    }
}
