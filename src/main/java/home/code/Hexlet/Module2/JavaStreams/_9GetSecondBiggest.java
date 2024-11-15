package home.code.Hexlet.Module2.JavaStreams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class App9 {
    public static Integer getSecondBiggest(List<Integer> list) {
        if (list.size() > 1) {
        return list.stream()
                .sorted()
                .toList()
                .get(list.size() - 2);}
        else return null;
    }
}

public class _9GetSecondBiggest {
    public static void main(String[] args) {
        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);

        System.out.println(App9.getSecondBiggest(numbers)); // 6
    }
}
