package home.code.Hexlet.Module2.JavaFunctions.Ispytaniya;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class App2 {
    public static List<List<String>> partition(List<String> list, Predicate<String> pr) {
        var newlist1 = new ArrayList<>();
        var newlist2 = new ArrayList<>();
        List lists = new ArrayList();
        for (String ls : list) {
            if (pr.test(ls)) {
                newlist1.add(ls);
            } else {
                newlist2.add(ls);
            }
        }
        lists.add(newlist1);
        lists.add(newlist2);
        return lists;
    }
}

public class _2ListSeparation {
    public static void main(String[] args) {
        var words = List.of("java", "php", "ruby", "clojure", "javascript", "lua");

        var parts = App2.partition(words, s -> s.length() > 4);
        System.out.println(parts);
        // => [[clojure, javascript], [java, php, ruby, lua]]
    }
}
