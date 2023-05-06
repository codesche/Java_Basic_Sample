

public class Exercise621 {
    public static void main(String[] args) {
        String value = "book2s.com";
        int defaultValue = 42;
        System.out.println(TryParse(value, defaultValue));
    }

    public static int TryParse(String value, int defalutValue) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return defalutValue;
        }
    }

}
