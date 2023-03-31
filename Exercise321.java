

public class Exercise321 {
    public static void main(String[] args) {
        System.out.println(m("1234"));
        System.out.println(m("12345"));
        System.out.println(m("123456"));
        System.out.println(m(null));
    }

    private static boolean m(String aString) {
        try {
            return aString.length() > 5;
        } catch (NullPointerException e) {
            System.out.println("An Exception Occurred!");
            return false;
        }
    }

}
