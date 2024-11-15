package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.ArrayList;
import java.util.List;

class App1 {
    public static List<Integer> sameParityFilter(List<Integer> list) {
        if (list.isEmpty()) return new ArrayList<Integer>();
        if (list.getFirst() % 2 == 0) {
            return list.stream()
                    .filter(x -> x % 2 == 0)
                    .toList();
        } else {
            return list.stream()
                    .filter(x -> x % 2 != 0)
                    .toList();
        }
    }
}

public class _1SameParityFilter {
    public static void main(String[] args) {
        List<Integer> coll1 = List.of(-1, 0, 1, -3, 10, -2);
        List<Integer> result1 = App1.sameParityFilter(coll1);
        System.out.println(result1); // [-1, 1, -3]

        List<Integer> coll2 = List.of(2, 0, 1, -3, 10, -2);
        List<Integer> result2 = App1.sameParityFilter(coll2);
        System.out.println(result2); // [2, 0, 10, -2]

        List<Integer> emptyColl = new ArrayList<>();
        List<Integer> result3 = App1.sameParityFilter(emptyColl);
        System.out.println(result3); // []
    }
}
