

public class Exercise568 {
    public static void main(String[] args) {
        String filename = "book2s.com";
        System.out.println(stripExtension(filename));
    }

    public static String stripExtension(String filename) {
        int index = filename.lastIndexOf(".");
        return filename.substring(0, index);
    }

}
