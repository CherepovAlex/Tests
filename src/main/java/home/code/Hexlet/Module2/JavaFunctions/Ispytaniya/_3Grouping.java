package home.code.Hexlet.Module2.JavaFunctions.Ispytaniya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

class App3 {
    public static Map<String, List<String>> groupBy(List<String> list, Function<String, String> fn) {
        var newMap = new HashMap<String, List<String>>();
        var newArrayList = new ArrayList<String>();
        for (String lang: list) {
            String tempString = fn.apply(lang);
            newMap.computeIfAbsent(tempString, temp -> new ArrayList<>())
                    .add(lang);
        }
        return newMap;
    }
}

public class _3Grouping {
    public static void main(String[] args) {
        var words = List.of("java", "javascript", "php", "ruby", "lisp", "lua");

        // Группируем слова по их длине
        var result = App3.groupBy(words, s -> Integer.toString(s.length()));
        System.out.println(result); // => {3=[php, lua], 4=[java, ruby, lisp], 10=[javascript]}
    }
}
