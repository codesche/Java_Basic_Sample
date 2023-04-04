import java.util.StringTokenizer;

public class Exercise365 {
    public static void main(String[] args) {
        StringTokenizer st1, st2;

        String quote1 = "AAAA 604.43 -0.42";
        st1 = new StringTokenizer(quote1);

        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        String quote2 = "AAA@60.39@0.11";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());
    }
}
