import java.util.ArrayList;
import java.util.List;
public class Main{
    public static List<String> findClubbedWords(String[] words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isClubbedWord(word, words, 0)) {
                result.add(word);
            }
        }
        return result;
    }
    private static boolean isClubbedWord(String word, String[] words, int start) {
        if (start == word.length()) {
            return true;
        }

        for (int i = start + 1; i <= word.length(); i++) {
            String prefix = word.substring(start, i);
            if (containsWord(prefix, words) && isClubbedWord(word, words, i)) {
                return true;
            }
        }

        return false;
    }
    private static boolean containsWord(String target, String[] words) {
        for (String word : words) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"mat", "mate", "matbellmates", "bell", "bellmatesbell", "butterribbon", "butter", "ribbon"};
        List<String> clubbedWords = findClubbedWords(words);

        System.out.println("Input: " + arrayToString(words));
        System.out.println("Output: " + clubbedWords);
    }
    private static String arrayToString(String[] words) {
        StringBuilder sb = new StringBuilder("[");
        for (String word : words) {
            sb.append("\"").append(word).append("\", ");
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
