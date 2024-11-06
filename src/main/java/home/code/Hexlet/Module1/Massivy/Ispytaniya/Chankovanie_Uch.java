package home.code.Hexlet.Module1.Massivy.Ispytaniya;

import java.util.Arrays;

class App9_1 {
    public static String[][] chunk(String[] words, int size) {

        var wordsCount = words.length;
        var chunksCount = (int) Math.ceil((double) wordsCount / size);
        var chunks = new String[chunksCount][0];
        var index = 0;

        for (var i = 0; i < wordsCount; i += size) {
            var to = Math.min(i + size, wordsCount);
            chunks[index] = Arrays.copyOfRange(words, i, to);
            index++;
        }
        // System.out.println(Arrays.deepToString(result));
        return chunks;
    }
}

public class Chankovanie_Uch {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four"};

        var chunks1 = App9_1.chunk(words, 2);
        System.out.println(Arrays.deepToString(chunks1));
// => [["one", "two"], ["three", "four"]]

        var chunks2 = App9_1.chunk(words, 3);
        System.out.println(Arrays.deepToString(chunks2));
// => [["one", "two", "three"], ["four"]]

    }
}
