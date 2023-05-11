

public class Exercise649 {
    public static void main(String[] args) {
        String s = "book2s.com";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }

}
