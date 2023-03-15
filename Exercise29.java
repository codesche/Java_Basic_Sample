

public class Exercise29 {
    public static void main(String[] args) {
        String str = "Hello, World";

        char c = str.charAt(0);
        System.out.println((int) c);        // 아스키 코드 - int형 변환시

        c = str.charAt(2);
        System.out.println((int) c);

        c = str.charAt(4);
        System.out.println((int) c);
    }
}
