

public class Exercise650 {
    public static void main(String[] args) {
        int level = 42;
        System.out.println(getIndentPrefix(level));
    }

    public static String getIndentPrefix(int level) {
        if (level <= 0) {
            return "";
        }

        StringBuffer result = new StringBuffer(level * 4);

        for (int i = 0; i < level; i++) {
            result.append("   ");
        }

        return result.toString();
    }

}
