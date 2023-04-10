

public class Exercise421 {

    private String jaText = "this is a test ";
    private String enText = "The fat cat sat on the mat with a brown rat.";
    private String enRegEx = "^The \\w+ cat.*";
    private String jaRegEx = ".*.*";
    private String jaRegExEscaped = ".*\u6587\u5B57.*";

    public Exercise421() {

        boolean found = false;
        found = enText.matches(enRegEx);
        if (found) {
            System.out.printf("Matches %s.\n", enRegEx);
        }

        found = jaText.matches(jaRegEx);
        if (found) {
            System.out.printf("Mathces %s.\n", jaRegEx);
        }

        found = jaText.matches(jaRegExEscaped);
        if (found) {
            System.out.printf("Matches %s.\n", jaRegExEscaped);
        }
    }

}
