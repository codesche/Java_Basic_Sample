

public class Exercise39 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("args size is 0");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

    }
}
