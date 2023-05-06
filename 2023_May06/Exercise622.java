

public class Exercise622 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(getIntegerByStr(str));
    }

    public static Integer getIntegerByStr(String str) {
        try {
            Integer temp = Integer.parseInt(str);
            return temp;
        } catch (Exception e) {
            return null;
        }
    }

}
