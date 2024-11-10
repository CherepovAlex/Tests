package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.Map;
import java.util.HashMap;

class App2_1 {

    // BEGIN
    public static boolean scrabble(String letters, String word) {

        var charsCount = countByChars(letters);

        for (var current : word.toLowerCase().toCharArray()) {
            var count = charsCount.getOrDefault(current, 0);

            if (count == 0) {
                return false;
            }

            charsCount.put(current, count - 1);
        }

        return true;
    }

    private static Map<Character, Integer> countByChars(String letters) {
        var chars = new HashMap<Character, Integer>();

        for (var current : letters.toCharArray()) {
            var count = chars.getOrDefault(current, 0);
            chars.put(current, count + 1);
        }

        return chars;
    }
    // END
}

public class _2ScrabbleV2 {
    public static void main(String[] args) {
        App2_1 .scrabble("rkqodlw", "world"); // true
        App2_1 .scrabble("avj", "java"); // false
        App2_1 .scrabble("avjafff", "java"); // true
        App2_1 .scrabble("", "hexlet"); // false
        App2_1 .scrabble("scriptingjava", "JavaScript"); // true
    }
}
