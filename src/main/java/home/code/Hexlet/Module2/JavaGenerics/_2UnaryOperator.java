package home.code.Hexlet.Module2.JavaGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class App2{
    public static List<Integer> duplicate(List<Integer> list) {
        var newList = new ArrayList<>(list);
        UnaryOperator<Integer> method = n -> n * 2;
        newList.replaceAll(method);
//        newList.replaceAll(n -> n * 2);
        return newList;
    }
}

public class _2UnaryOperator {
    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(2, 3, 5));

        var result = App2.duplicate(numbers);

        System.out.println(result); // => [4, 6, 10]

        // Вернулся новый список
        System.out.println(numbers == result); // false
    }
}
