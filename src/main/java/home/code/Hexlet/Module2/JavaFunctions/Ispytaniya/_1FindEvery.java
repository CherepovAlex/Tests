package home.code.Hexlet.Module2.JavaFunctions.Ispytaniya;

import java.util.List;
import java.util.function.Predicate;

class App1 {
    public static boolean every(List<String> list, Predicate<String> pr) {
        for (String word: list){
            if (pr.test(word) == false){
                return false;
            };
        }
        return true;
    }
}

public class _1FindEvery {
    public static void main(String[] args) {
        var words = List.of("javascript", "java", "joker", "james");

        System.out.println(App1.every(words, s -> s.startsWith("j")));
        System.out.println(App1.every(words, s -> s.endsWith("a")));
    }
}
