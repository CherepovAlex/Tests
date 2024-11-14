package home.code.Hexlet.Module2.JavaStreams;

import java.util.List;

class App1 {
    public static List<String> sortWords(List<String> list) {
        return list.stream().sorted().toList();
    }
}

public class _1SortWords {
    public static void main(String[] args) {
        var fruits = List.of("lemon", "apple", "banana");
        var result = App1.sortWords(fruits);
        System.out.println(result); // => [apple, banana, lemon]
    }
}
