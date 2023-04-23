

public class Exercise535 {
    public static void main(String[] args) {
        String name = "book2s.com";
        System.out.println(getFileExtension(name));
    }

    public static String getFileExtension(String name) {
        String ext = "";
        if (name.contains(".")) {
            ext = name.substring(name.lastIndexOf(".") + 1);
        }
        return ext;
    }

}
