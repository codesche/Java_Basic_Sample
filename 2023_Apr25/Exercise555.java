

public class Exercise555 {
    public static void main(String[] args) {
        StringBuilder innerBody = new StringBuilder();
        innerBody.append("abc  ");
        trimTrailingWhiteSpace(innerBody);
    }

    public static void trimTrailingWhiteSpace(StringBuilder innerBody) {
        while (Character.isWhitespace(innerBody.charAt(innerBody.length() - 1))) {
            innerBody.deleteCharAt(innerBody.length() - 1);
        }
    }

}
