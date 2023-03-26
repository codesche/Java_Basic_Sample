

public class Exercise243 {
    public static void main(String[] args) {
        for (String argument : args) {
            switch (argument) {
                case "-verbose":
                case "-v":
                    System.out.println("-v");
                    break;
                case "-log":
                    System.out.println("-log");
                    break;
                case "-help":
                    System.out.println("-help");
                    break;
                default:
                    System.out.println("Illegal command line argument");
            }
        }
    }
}
