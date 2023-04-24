import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise544 {
    public static void main(String[] args) {
        String t1 = "book2s.com";
        String t2 = "book2s.com";
        System.out.println(findLongestCommonSubstring(t1, t2));
    }

    public static String findLongestCommonSubstring(final String t1, final String t2) {
        String s1 = t1.toLowerCase();
        String s2 = t2.toLowerCase();

        final int shortestWordLength = Math.min(t1.length(), t2.length());
        Set<String> s1SubWords;
        Set<String> s2SubWords;
        String subWord = "";

        int subWordLength = shortestWordLength;
        while (subWordLength > 0) {
            s1SubWords = generateSubWords(s1, subWordLength);
            s2SubWords = generateSubWords(s2, subWordLength);

            subWord = searchForCommonString(s1SubWords, s2SubWords);
            if (!subWord.isEmpty()) {
                break;
            }
            subWordLength--;
        }
        return subWord;
    }

    public static Set<String> generateSubWords(String word, int length) {
        if (length > word.length()) {
            throw new IllegalArgumentException("The word '" + word
                + "' length cannot be less than the length " + length
                + " of the words to be generated.");
        }

        Set<String> generatedWords = new LinkedHashSet<>();
        for (int i = 0; i <= (word.length() - length); i++) {
            generatedWords.add(word.substring(i, length + i));
        }
        return generatedWords;
    }

    public static String searchForCommonString(Set<String> s1, Set<String> s2) {
        String matched = "";
        for (String s1Word : s1) {
            if (s2.contains(s1Word)) {
                matched = s1Word;
                break;
            }
        }
        return matched;
    }
}
