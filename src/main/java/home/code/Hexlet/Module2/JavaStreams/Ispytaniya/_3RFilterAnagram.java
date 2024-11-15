package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class App3 {
    public static List<String> filterAnagram(String word, List<String> list) {
            return list.stream()
                .filter(str -> Arrays.equals(str.chars().sorted().toArray(), word.chars().sorted().toArray()))
                .collect(Collectors.toList());
    }
}

public class _3RFilterAnagram {
    public static void main(String[] args) {
        List<String> coll1 = List.of("aabb", "abcd", "bbaa", "dada");
        List<String> result1 = App3.filterAnagram("abba", coll1);
        System.out.println(result1); // ["aabb", "bbaa"]

        List<String> coll2 = List.of("crazer", "carer", "racar", "caers", "racer");
        List<String> result2 = App3.filterAnagram("racer", coll2);
        System.out.println(result2); // ["carer", "racer"]

        List<String> coll3 = List.of("lazing", "lazy", "lacer");
        List<String> result3 = App3.filterAnagram("laser", coll3);
        System.out.println(result3); // []
    }
}
