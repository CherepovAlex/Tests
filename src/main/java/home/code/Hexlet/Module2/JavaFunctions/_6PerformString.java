package home.code.Hexlet.Module2.JavaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class App6 {
    public static List<String> map(List<String> list, Function<String, String > fn) {
        var words = new ArrayList<String>();
        for (String word : list) {
            words.add(fn.apply(word));
        }
        return words;
    }
}

public class _6PerformString {
    public static void main(String[] args) {
        var words = new ArrayList<String>();
        words.add("Java");
        words.add("Python");
        words.add("PHP");

        var result = App6.map(words, word -> word.toUpperCase());

        System.out.println(result); // ["JAVA", "PYTHON", "PHP"]
    }
}
