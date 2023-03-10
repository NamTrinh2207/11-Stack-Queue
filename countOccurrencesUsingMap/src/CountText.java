import java.util.Map;
import java.util.TreeMap;

public class CountText {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static Map<String, Integer> countWords(String input) {

        Map<String, Integer> wordMap = new TreeMap<>();
        if (input == null) {
            return wordMap;
        }

        int size = input.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                sb.append(input.charAt(i));
            } else {
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordMap, sb);
        return wordMap;
    }

    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}