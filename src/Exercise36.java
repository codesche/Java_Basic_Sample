
public class Exercise36 {
    public static void main(String[] args) {
        String str = "Hello, World";

        System.out.println(str.toLowerCase().contains("Hel".toLowerCase()));
        System.out.println(str.toLowerCase().contains("llo".toLowerCase()));

        System.out.println(str.toLowerCase().contains("hello".toLowerCase()));
        System.out.println(str.toLowerCase().contains("world".toLowerCase()));
    }
}
