package home.code.Hexlet.Module2.JavaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class App3 {
    public static ArrayList<String> typeOfNumber = new ArrayList<>();

    public static Map<String, Integer> createHashMap() {
        var map = new HashMap<String, Integer>();
        map.put("zero", 0);
        map.put("negative", 0);
        map.put("positive", 0);
        return map;
    }

    public static Map<String, Integer> countNumbers(List<Integer> list) {

        var newList = new ArrayList<>(list);
        var map = createHashMap();
        map.forEach((key, value) -> typeOfNumber.add(key));

        newList.forEach((number) -> {
            if (number > 0) {
                map.compute(typeOfNumber.get(2), (key, count) -> count == null ? 1 : count + 1);
            } else if (number < 0) {
                map.compute(typeOfNumber.get(1), (key, count) -> count == null ? 1 : count + 1);
            } else {
                map.compute(typeOfNumber.get(0), (key, count) -> count == null ? 1 : count + 1);
            }
        });
        return map;
    }
}

public class _3CountPosNNeg {
    public static void main(String[] args) {
        var numbers1 = List.of(-2, -3, 4, 3, 8, 0);
        var result1 = App3.countNumbers(numbers1);
        System.out.println(result1); // => {"negative"=2, "positive"=3, "zero"=1}

        var numbers2 = List.of(-2, -3, -2);
        var result2 = App3.countNumbers(numbers2);
        System.out.println(result2); // => {"negative"=3, "positive"=0, "zero"=0}
    }
}
