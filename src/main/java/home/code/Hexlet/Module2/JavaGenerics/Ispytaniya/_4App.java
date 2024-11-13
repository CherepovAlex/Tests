package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _4App {
    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        var newList = new ArrayList<>(list);
        T max = list.getFirst();
        for (T element: newList){
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        var coll1 = List.of("a", "b", "x", "h", "o");
        System.out.println(_4App.findMax(coll1)); // x

        var coll2 = List.of(1, 2, 3, 10, 4, 5, 6);
        System.out.println(_4App.findMax(coll2)); // 10
    }
}
