

public class Exercise532 {
    public static void main(String[] args) {
        String name = "\"book2s.combook2s.com book2s.com book2s.com book2s.com book2s.com book2s.com book2s.com book2s.com book2s.com\"";
        System.out.println(truncateString(name));
    }

    private static final int TRUNCATE_LENGTH = 60;

    public static String truncateString(String name) {
        if (name != null && name.length() > TRUNCATE_LENGTH) {
            return name.substring(0, TRUNCATE_LENGTH) + " ...";
        }
        return name;
    }
}
