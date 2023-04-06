import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise381 {
    public static void main(String[] args) {
        System.out.println(validateParentheses("{{}}[]"));
        System.out.println(validateParentheses("{{}}["));
        System.out.println(validateParentheses("{{}}[]]"));
    }

    public static boolean validateParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else if (s.charAt(i) == '}' && stack.peekLast() == '{') {
                stack.removeLast();
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peekLast() == '[') {
                stack.removeLast();
            } else if (s.charAt(i) == ')' && stack.peekLast() == '(') {
                stack.removeLast();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
