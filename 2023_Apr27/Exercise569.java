

public class Exercise569 {
    public static void main(String[] args) {
        String filename = "book2s.com\\";
        System.out.println(stripPath(filename));
    }

    public static String stripPath(String filename) {
        int index = filename.lastIndexOf("\\");
        if (index == -1) {
            return filename;
        }
        return filename.substring(index + 1);
    }

}
