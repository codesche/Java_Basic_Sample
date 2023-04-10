

public class Exercise418 {
    public static void main(String[] args) {
        String regex = ".@.";

        Exercise418.matchIt("a@k", regex);
        Exercise418.matchIt("webmaster@mypkg.com", regex);
        Exercise418.matchIt("r@j", regex);
        Exercise418.matchIt("a%N", regex);
        Exercise418.matchIt(".@.", regex);
    }

    public static void matchIt(String str, String regex) {
        if (str.matches(regex)) {
            System.out.println(str + " matches the regex " + regex);
        } else {
            System.out.println(str + " does not match the regex " + regex);
        }
    }

}

