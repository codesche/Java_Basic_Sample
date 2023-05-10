

public class Exercise644 {
    public static void main(String[] args) {
        String str = "X" + "Y" + 12.56;
        System.out.println(str);
        str = new StringBuilder().append("X").append("Y").append(12.56).toString();
        System.out.println(str);
    }
}
