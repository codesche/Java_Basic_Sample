

public class Exercise590 {
    public static void main(String[] args) {
        String template = "book2s.com";
        String placeholder = "o";
        String replacement = "O";
        System.out.println(replace(template, placeholder, replacement));
    }

    public static String replace(String template, String placeholder, String replacement) {
        return replace(template, placeholder, replacement, false);
    }

    public static String[] replace(String templates[], String placeholder, String replacement) {
        String[] result = new String[templates.length];
        for (int i = 0; i < templates.length; i++) {
            result[i] = replace(templates[i], placeholder, replacement);
        }
        return result;
    }

    public static String replace(String template, String placeholder,
                                 String replacement, boolean wholewords) {
        int loc = template == null ? -1 : template.indexOf(placeholder);
        if (loc < 0) {
            return template;
        } else {
            final boolean actuallyReplace = !wholewords
                    || loc + placeholder.length() == template.length()
                    || !Character.isJavaIdentifierPart(template.charAt(loc
                            + placeholder.length()));

            String actualReplacement = actuallyReplace ? replacement : placeholder;

            return new StringBuffer(template.substring(0, loc))
                    .append(actualReplacement)
                    .append(replace(
                            template.substring(loc + placeholder.length()),
                            placeholder, replacement, wholewords))
                    .toString();
        }
    }

    public static String toString(Object[] array) {
        int len = array.length;
        if (len == 0) {
            return "";
        }
        StringBuffer buf = new StringBuffer(len * 12);
        for (int i = 0; i < len - 1; i++) {
            buf.append(array[i]).append(", ");
        }
        return buf.append(array[len - 1]).toString();
    }

}
