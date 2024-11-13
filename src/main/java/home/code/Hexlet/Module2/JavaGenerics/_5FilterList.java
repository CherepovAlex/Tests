package home.code.Hexlet.Module2.JavaGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _5FilterList {
    public static <T> List<T> filter(ArrayList<T> list, Predicate<T> pr) {
        List<T> newList = new ArrayList<>();
        for (T element : list) {
            if (pr.test(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        var languages = new ArrayList<>(List.of("java", "javascript", "php", "ruby"));
        var result = _5FilterList.filter(languages, l -> l.startsWith("j"));
        System.out.println(result); // => ["java", "javascript"]

        var numbers = new ArrayList<>(List.of(1, 2, 5, 0, 8, 3));
        var result1 = _5FilterList.filter(numbers, n -> n > 4);
        System.out.println(result1); // => [5, 8]

    }
}
