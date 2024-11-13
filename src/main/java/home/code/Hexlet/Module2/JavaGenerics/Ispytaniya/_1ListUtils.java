package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

import java.util.ArrayList;
import java.util.List;

public class _1ListUtils {
    public static <T> ArrayList<T> uniq(ArrayList<T> list) {
        var newList = new ArrayList<T>();
        for (T element: list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {

        var fruits = new ArrayList<>(List.of("mango", "apple", "lemon", "apple", "pear", "mango"));
        var result = _1ListUtils.uniq(fruits);
        System.out.println(result); // => [mango, apple, lemon, pear]

    }
}
