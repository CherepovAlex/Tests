package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.HashMap;
import java.util.Map;

class App1 {
    public static boolean scrabble(String simbols, String word) {
        if ((word.length() > simbols.length() || word.isEmpty() || simbols.isEmpty())) return false;

        char[] simbolsChar = simbols.toLowerCase().toCharArray();
        char[] wordChar = word.toLowerCase().toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < simbolsChar.length; i++) {
            if (!map1.containsKey(simbolsChar[i])) {
                map1.put(simbolsChar[i], 1);
            } else {
                map1.put(simbolsChar[i], map1.get(simbolsChar[i]) + 1);
            }
        }

        for (var key : wordChar) {
            if (map1.containsKey(key)) {
                var count = map1.get(key);
                map1.put(key, count - 1);
                if (map1.get(key) < 0) return false;
            } else {
                return false;
            }
        }
        return true;
    }
}

public class _2Scrabble {
    public static void main(String[] args) {

        System.out.println(App1.scrabble("rkqodlw", "world")); // true +
        System.out.println(App1.scrabble("avj", "java")); // false +
        System.out.println(App1.scrabble("avjafff", "java")); // true +
        System.out.println(App1.scrabble("", "hexlet")); // false +
        System.out.println(App1.scrabble("begsdhhtsexoult", "hexlet")); // true +
        System.out.println();
        System.out.println(App1.scrabble("nastenka", "steak")); // true +
        System.out.println(App1.scrabble("scriptingjava", "javascript")); //true +
        System.out.println(App1.scrabble("scriptingjava", "JavaScript")); // true +
        System.out.println(App1.scrabble("javasprint", "javascript")); // false -
        System.out.println(App1.scrabble("scriptjavest", "javascript")); // false -
        System.out.println(App1.scrabble("katas", "steak")); // false -
        System.out.println(App1.scrabble("", "javascript")); // false +

    }
}
