package Hexlet.Module1.VvedenieVOOP.Kurs;

import java.util.Arrays;
import java.util.stream.Stream;

class App6 {
    public static boolean hasDuplicates(String[] words) {
        var copy = Arrays.copyOf(words, words.length);
        Arrays.sort(copy);

        for (var i = 0; i < copy.length - 1; i++) {
            var currentChar = copy[i];
            var nextChar = copy[i + 1];

            if (currentChar.equals(nextChar)) {
                return true;
            }
        }

        return false;
    }
}

public class _6Duplicates {
    public static void main(String[] args) {
        System.out.println(App6.hasDuplicates(new String[]{"java", "javascript", "php", "java"})); // true
        System.out.println(App6.hasDuplicates(new String[]{"java", "javascript", "php", "perl"})); // false
    }
}
