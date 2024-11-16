package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import home.code.Hexlet.Module2.JavaGenerics.Ispytaniya.model.Pair;

import java.util.ArrayList;
import java.util.List;

class App4 {
    public static Integer findIndexOfNearest(List<Integer> list, Integer number) {
        var i = 0;
        return list.stream()
                .min((a, b) -> Integer.compare(Math.abs(a - number), Math.abs(b - number)))
                .map(list::indexOf)
                .orElse(-1);
    }
}

public class _4FindIndexOfNearest {
    public static void main(String[] args) {
        System.out.println(App4.findIndexOfNearest(new ArrayList<Integer>(), 0)); // -1

        List<Integer> coll1 = List.of(15, 10, 3, 4);
        System.out.println(App4.findIndexOfNearest(coll1, 0)); // 2

        List<Integer> coll2 = List.of(7, 5, 3, 2);
        System.out.println(App4.findIndexOfNearest(coll2, 4)); // 1

        List<Integer> coll3 = List.of(7, 5, 4, 4, 3);
        System.out.println(App4.findIndexOfNearest(coll3, 4)); // 2
    }
}
