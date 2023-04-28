

public class Exercise570 {
    public static void main(String[] args) {
        String html = "<b>ook2s.com";
        System.out.println(stripHtmlSpecialChars(html));
    }

    public static String stripHtmlSpecialChars(String html) {
        if (html == null) {
            return null;
        }
        html = html.replaceAll("</?[^>]+>", "");
        html = html.replace("&nbsp;", " ");

        return html;
    }

}
