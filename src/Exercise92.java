

public class Exercise92 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] temp = a.split(":");
        String result = String.join("#", temp);
        System.out.println(result);
    }
}
