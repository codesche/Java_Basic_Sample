

public class Exercise329 {

    String[] input = { "123123", "1231321", "12312fdfd" };

    public static void main(String[] args) {
        Exercise329 hex = new Exercise329();
        for (int i = 0; i < hex.input.length; i++) {
            hex.readLine(hex.input[i]);
        }
    }

    void readLine(String code) {
        try {
            for (int i = 0; i < code.length(); i += 2) {
                String sub = code.substring(i , i + 2);
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {
                    return;
                }
                System.out.println(num + " ");
            }
        } finally {
            System.out.println("**");
        }
        return;
    }
}
