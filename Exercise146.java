

public class Exercise146 {
    public static void main(String[] args) {
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);         // 객체 생성 (Heap)
        System.out.println(s4);         // 객체 생성 (Heap)
    }
}
