

public class Exercise191 {
    static int x;
    
    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x = 0;
        System.out.println("x = " + x);
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " + Exercise191.x);
    }
}
