package Hexlet.Module2.JavaLists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class App2 {

    public static List<Integer> replaceByZero(List<Integer> list) {
        var newList = new ArrayList<Integer>();
        for (var listEl: list){
            if (listEl < 0){
                newList.add(0);
                continue;
            }
            newList.add(listEl);
        }
        return newList;
    }
}

public class _2ReplaceByZero {
    public static void main(String[] args) {

        var items = List.of(1, -2, 3, -5);

        var result = App2.replaceByZero(items);
        System.out.println(result); // => [1, 0, 3, 0]

        System.out.println(items); // => [1, -2, 3, -5]


    }


}
